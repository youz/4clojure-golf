;; main
(fn [q c n]
  (#({0 nil} % %)
   (apply max
     (for [
           ; rotate
           m (take 4 (iterate q (map #(subs (Long/toBinaryString (+ 64 %)) 1) n)))
           ; slice horizontal
           h (map drop (range) (repeat (- (count m) 1) m))
           ; slice vertical
           v (map #(map (fn [r] (subs r %)) %2) (range) (repeat (count (nfirst h)) h))
           ]
       (c v)))))

;; rotate 90 degrees
#(reverse (apply map str %))

;; cut out a triangle and count minerals
(fn [m]
  (let [w (count (take-while #{\1} (first m)))
        h (count m)]
    (cond (< w 2) 0
          (and (>= h w) (apply = \1 (mapcat #(subs % 0 %2) m (range w 0 -1))))
          ; 111
          ; 110
          ; 100
            (* 1/2 w (+ w 1))
          (and (odd? w) (> h (/ w 2))
               (apply = \1 (mapcat #(subs % %2 (- w %2)) m (range (/ w 2)))))
          ; 111
          ; 010
          ; 000
            (/ (+ (* w w) w w 1) 4)
          :else 0)))
