#(map (fn [x] (take % (drop (* % x) %2)))
  (range (quot (count %2) %)))
