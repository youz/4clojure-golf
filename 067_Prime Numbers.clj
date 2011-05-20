(fn [r c]
  (take c
	(remove #(some (fn [i] (= (mod % i) 0)) (r 2 %))
		(r 2 1e3))))
range
