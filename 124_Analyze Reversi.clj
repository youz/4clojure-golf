(fn [B P]
  (let [c count r range a apply
        d (r 3)
        e #([(r % 4) [% % % %] (r % -1 -1)] %2)]
    (a conj
       (for [y (r 4) x (r 4)]
         (#({() {}} % {[y x] (set %)})
          (a concat
             (for [u d v d :let [l (map vector (e y u) (e x v))]]
               (rest
                (take (- (c (re-find ({'b #"^ew+b"} P #"eb+w")
                                    (a str (map #(get-in B %) l))))
                         1) l)))))))))
