#(fn [v]
  ((fn r [x]
     (if (seq? x)
       (apply ({'+ + '- - '* *} (nth x 0) /) (map r (rest x)))
       (v x x)))
   %))
