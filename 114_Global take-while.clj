(fn f [l d [h & r]]
  (#(if (> % 0) (cons h (f % d r)) ())
   (if (d h) (- l 1) l)))
