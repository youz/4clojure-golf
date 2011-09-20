;;; (__ 1982) must be 'true' ?
#(let [s (str %)
       f (fn [s] (sort (take (/ (count s) 2) s)))]
  (= (f s) (f (reverse s))))
