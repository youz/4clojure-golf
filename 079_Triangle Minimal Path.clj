(fn [s]
  (last
   (reduce (fn [c l] (map #(+ (min %2 %3) %) l (rest c) c))
	   (reverse s))))
