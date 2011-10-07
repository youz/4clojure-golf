(fn [B P]
  (let [r range a apply v vector q (r 4)
        d #(v (r % 4) [% % % %] (r % -1 -1))]
    (a conj
       (for [y q x q]
         (#({() {}} % {[y x] (set %)})
          (a concat
             (for [i (d y) j (d x)]
               (#(-> ({'b #"^ew+b"} P #"^eb+w")
                  (re-find (a str (map %2 %)))
                  count dec (take %) rest)
                (map v i j) #(get-in B %)))))))))
