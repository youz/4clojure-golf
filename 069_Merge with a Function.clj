(fn [r f & l]
  (r #(r (fn [m [k v]]
	   (assoc m k (if (m k) (f (m k) v) v)))
       % %2)
     l))
reduce
