(fn [B P]
  (let [r range v vector q (r 4)
        g #(get-in B %)
        d #(v (r % 4) [% % % %] (r % -1 -1))]
    (into {}
          (for [y q x q]
            (mapcat #({() {}} % {[y x] (set %)})
                    (for [i (d y) j (d x)]
                      (#(-> P {'b #"^ew+b" 'w #"^eb+w"}
                           (re-find (apply str (map g %)))
                           count dec (take %) rest)
                       (map v i j))))))))
