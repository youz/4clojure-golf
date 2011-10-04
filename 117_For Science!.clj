(fn [r m]
  (not= nil (some #(re-seq #"C@" %)
                  (flatten (take 50 (iterate r m))))))
#(map (fn [s] (.replaceAll s "(M|@) " "$1@"))
  (reverse (apply map str %)))
