#(if (= %2 (clojure.contrib.pprint/cl-format nil "~@R" %))
  %
  (recur (inc %) %2)) 1
