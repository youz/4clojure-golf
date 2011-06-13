(fn [n f r c x y]
  (last
   (f #(f (fn [c i]
	    (conj c (+ 1 (min (n % (+ i 1)) (n c i)
			      (- (n % i) ({(n x i) 1} (n y %2) 0))))))
	  [(+ %2 1)] (r (c x)))
      (r (+ 1 (c x)))
      (r (c y)))))
nth reduce range count
