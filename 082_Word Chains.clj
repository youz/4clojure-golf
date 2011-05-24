(fn [d s]
  (boolean
   (some (fn f [[a r]]
	   (or (empty? r)
	       (some #(if (< (d a %) 2) (f [% (disj r %)])) r)))
	 (map #(list % (disj s %)) s))))
(fn [x y]
  (let [f reduce r range c count l (c x)]
    (last
     (f #(f (fn [c i]
	      (conj c (+ 1 (min (% (+ i 1)) (c i)
				(- (% i) (if (= (nth x i) (nth y %2)) 1 0))))))
	  [(+ %2 1)] (r l))
	`[~@(r l) ~l] (r (c y))))))
