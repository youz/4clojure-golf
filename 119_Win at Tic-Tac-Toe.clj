(fn [r d p m]
  (set
   (for [y r x r
           :let [b (for [j r] (for [i r] ({[x y] p} [i j] ((m j) i))))]
           :when
           (and (= :e ((m y) x))
                (some #(apply = p %)
                      `(~@b ~@(apply map list b) ~(d b r) ~(d b [2 1 0]))))]
     [y x])))
[0 1 2] #(map nth % %2)
