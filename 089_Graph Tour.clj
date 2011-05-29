(fn [d [h & r]]
  ((fn f [a r]
     (or (empty? r)
	 (boolean
	  (some #(f (nth (d #{a} %) 0) (d #{%} r))
		(filter #(some #{a} %) r)))))
   (h 1) r))
remove
