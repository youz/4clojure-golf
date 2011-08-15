(fn [c u]
  (set (filter
        #(= (count %) c)
        (reduce (fn [a e]
                  (reduce #(conj % (conj %2 e)) a a))
                #{#{}} u))))
