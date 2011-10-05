(fn [B P]
  (let [c count r range a apply
        W (c B) H (c (B 0))
        d (r 3)
        e #([(r % %2) (repeat %2 %) (r % -1 -1)] %3)]
    (a conj
       (for [y (r H) x (r W) :when (= ((B y) x) 'e)]
         (#({() {}} % {[y x] (set %)})
          (a concat
             (for [u d v d :let [l (rest (map vector (e y H u) (e x W v)))]]
               (if (= u v 1)
                 ()
                 (take (- (c (re-find ({'b #"^w+b"} P #"b+w")
                                      (a str (map #(get-in B %) l))))
                          1) l)))))))))
