(fn [n t]
  (let [a (atom n)]
    ((fn f [x]
       (take-while identity
                   (map #(if (coll? %)
                          (let [s (f %)] ({() nil} s s))
                          (if (>= (swap! a - %) 0) %))
                        x)))
     t)))
