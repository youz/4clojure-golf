(fn [s & r]
  (some #(if (apply = % (map (fn [l] (first (remove (fn [n] (< n %)) l))) r))
	  %)
	s))
