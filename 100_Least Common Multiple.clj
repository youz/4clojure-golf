(fn [e & r]
  ((fn f [p]
     (if (every? #(= (mod p %) 0) r)
       p
       (f (+ p e))))
   e))
