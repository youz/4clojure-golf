(fn [r u]
  (r (fn [a e]
       (r #(conj % (conj %2 e)) a a))
     #{#{}} u))
reduce
