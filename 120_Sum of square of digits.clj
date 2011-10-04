#(count (filter (fn [n] (< n (apply + (map (fn [c] (Math/pow (- (int c) 48) 2)) (str n))))) %))
