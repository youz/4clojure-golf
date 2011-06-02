(fn [e o]
  (let [[h & r] (seq o)]
    ((fn f [c r]
       (or (e r)
	   (let [n (mapcat #(filter (fn [p] (some (set %) p)) r) c)]
	     (if (e n) false
	       (f (reduce conj c n)
		  (remove (set n) r))))))
     #{h} r)))
empty?
