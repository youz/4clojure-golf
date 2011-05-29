(fn [c m]
  (let [w (count m) s (c m)]
    (map c
	 (partition w
	  (map-indexed
	   (fn [i x]
	     (({\# {2 \# 3 \#}} x {3 \#})
	      (apply + (map #({\# 1 \  0} (nth s(+ % i) \  ))
			    [(- -1 w) (- w) (- 1 w)
			     -1 1 (- w 1) w (+ w 1)]))
	      \  ))
	   s)))))
#(apply str %)
