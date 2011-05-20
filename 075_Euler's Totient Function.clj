(fn [n]
  (+ 1 (count
	(filter (fn [i] (= (str i '/ n) (str (/ i n))))
		(range 2 n)))))
