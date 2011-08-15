#((fn f [m k [e & r]]
    (if e
      (if (keyword? e)
        (f (conj m {e []}) e r)
        (f (conj m {k (conj (m k []) e)}) k r))
      m))
  {} (first %) (rest %))
