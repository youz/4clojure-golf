(fn r [x]
  (or (= x nil)
      (and (coll? x)
	   (= (count x) 3)
	   (every? r (rest x)))))
