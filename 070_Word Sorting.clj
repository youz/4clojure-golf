(fn [s]
  (sort #(.compareToIgnoreCase % %2)
	(re-seq #"\w+" s)))
