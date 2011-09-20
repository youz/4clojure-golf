#(if %&
  (reify
   clojure.lang.ISeq
   (toString [_] (apply str (interpose ", " (sort %&))))
   (seq [_] (distinct %&))))
