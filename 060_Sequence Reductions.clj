(fn f
 ([g [h & r]] (f g h r))
 ([g i [h & r]]
  (cons i (if h (lazy-seq (f g (g i h) r))))))
