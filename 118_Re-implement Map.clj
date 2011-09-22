;;; can't process empty sequences
(fn m [f [h & r]] (lazy-seq (cons (f h) (if r (m f r)))))
