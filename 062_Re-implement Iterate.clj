(fn r [f %]
  (cons % (lazy-seq (r f (f %)))))
