(fn [[n l r]]
  (= l ((fn f [[n l r]]
	  (if n [n (f r) (f l)]))
	r)))
