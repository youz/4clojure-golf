(fn [o]
  (let [[h & r] (seq o)]
    ((fn f [c r]
       (if (empty? r) true
	 (let [n (mapcat #(filter (fn [p] (some (set %) p)) r) c)]
	   (if (empty? n) false
	     (f (reduce conj c n)
		(remove (set n) r))))))
     #{h} r)))
