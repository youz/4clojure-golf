#(= % (apply + (filter (fn [i] (= (mod % i) 0)) (range 1 %))))

