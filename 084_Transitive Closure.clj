(fn f [s]
  (#(if (= % s) s (f %))
   (set (for [[a b] s [c d] s]
	  [a (if (= b c) d b)]))))
