(let [p (iterate #(.nextProbablePrime (bigint %)) 2)]
  #(= % (nth (for [[a b c] (map list (next p) p (nnext p))
                   :when (and (>= a %)
                              (= a (/ (+ b c) 2)))]
               a) 0)))
