(fn [s d b e q]
  (b (s (fn f [[w r]]
	  (or (empty? r)
	      (s #(if (or (s #{(vec w)} (e %))
			  (s #{(vec %)} (e w))
			  (s b (map = (e w) (e %))))
		   (f [% (d r %)]))
		 r)))
	(for [w q] [w (d q w)]))))
some disj boolean
#(map (fn [_ i] `[~@(take i %) ~@(drop (+ i 1) %)]) % (range))

