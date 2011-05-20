#!clojure

(ns foreclojure.util)
(require '[clojure.java.io :as jio])

;;; from https://github.com/dbyrne/4clojure/blob/develop/src/foreclojure/problems.clj
(defn- code-length [f]
  (let [code (slurp f)]
    (count (remove #(Character/isWhitespace %) code))))

(defn- get-answers [folder]
  (let [d (new java.io.File folder)]
    (if (not (.isDirectory d)) {}
      (group-by #(let [fname (.getName %)]
		  (cond (not (re-find #"\.clj$" fname)) :else
			(re-find #"embed" fname) :embed
			:else :nonembed))
		(. d (listFiles))))))

(defn- calc-score [ans]
  (loop [total 0
	 embed 0
	 detail []
	 [file & r] (ans :nonembed)]
    (if file
	(let [n (.getName file)
	      e (some #(if (= n (.replaceAll (.getName %) "embed_" "")) %) (ans :embed))
	      lf (code-length file)
	      le (if e (code-length e))]
	  (recur (+ total lf) (+ embed (or le lf)) (conj detail [lf (or le \-) n]) r))
      {:total total :embed embed :detail detail})))

(defn- render
  ([score] (render score *out*))
  ([score w]
   (.write w (str "solved: " (count (score :detail)) "\n"))
   (.write w (str "total: " (score :total) " / embed: " (score :embed) "\n\n"))
   (.write w " score | embed | file\n")
   (.write w "-------+-------+--------------------\n")
   (doseq [d (sort-by first > (score :detail))]
     (.write w (apply format " %5d | %5s | %s\n" d)))))

(defn main []
  (let [[folder output] *command-line-args*]
    (if (not folder)
	(println "usage: clojure 4cljscore.clj foldername [output]")
      (let [score (calc-score (get-answers folder))]
	(if output
	    (with-open [w (jio/writer output)]
	      (render score w)
	      (println "output to" output))
	  (render score))))))

(main)
