(fn f [v a b c]
  (if (= c 0) v
    (f (conj v a) b (+ a b) (dec c))))
[] 1 1
