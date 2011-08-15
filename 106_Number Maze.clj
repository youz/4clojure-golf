#((fn r [n s]
    (if ((set s) %2) n
      (r (+ n 1)
         (for [f [+ * /] e s] (f e 2)))))
  1 [%])
