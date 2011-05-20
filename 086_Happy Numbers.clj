#(or (= % 1)
  (if (= % 4) false
    (recur
      (reduce (fn [a c] (+ a (* (- (int c) 48) (- (int c) 48))))
	      0 (str %)))))
