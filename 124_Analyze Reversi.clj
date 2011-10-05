(fn [B P]
  (let [r range a apply v vector
        d #(v (r % 4) [% % % %] (r % -1 -1))]
    (a conj
       (for [y (r 4) x (r 4)]
         (#({() {}} % {[y x] (set %)})
          (a concat
             (for [i (d y) j (d x) :let [l (map v i j)]]
               (rest
                (take (- (count (re-find ({'b #"^ew+b"} P #"^eb+w")
                                    (a str (map #(get-in B %) l))))
                         1) l)))))))))
