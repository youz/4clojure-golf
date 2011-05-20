#(some (fn [a]
	 (let [l (map (fn[i] (nth (flatten %) i)) a)]
	   (if (apply = l) (#{:o :x} (last l)))))
  (partition 3 `[~@(range 9) 0 3 6 1 4 7 2 5 8 0 4 8 2 4 6]))
