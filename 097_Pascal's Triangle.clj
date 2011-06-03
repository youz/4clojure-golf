(fn [c]
  (nth
    (iterate
      #(map + `[0 ~@%] `[~@% 0]) [1])
  (- c 1)))
