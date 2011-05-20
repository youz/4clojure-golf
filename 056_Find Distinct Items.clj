(fn f [a [x & r]]
  (if x (f (if ((set a) x) a (conj a x)) r) a))
[]
