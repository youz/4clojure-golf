;;; inspired by https://gist.github.com/1024984

(fn [a x b]
  (#{:o :x}
   (ffirst
    (filter #(a = %)
      `(~@b ~@(a map list b) ~(x b [0 1 2]) ~(x b [2 1 0]))))))
apply #(map get % %2)

;;; This code fails in some cases.
;;; ref. https://twitter.com/#!/alanmalloy/status/80680005360828416


;;; correct version
; (fn [a x b]
;  (ffirst
;   (remove #(or (some #{:e} %) (a not= %))
;     `(~@b ~@(a map list b) ~(x b [0 1 2]) ~(x b [2 1 0])))))
;apply #(map get % %2)
