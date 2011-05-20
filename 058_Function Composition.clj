(fn [& f]
  #((reduce (fn [v f] [(apply f v)]) %& (reverse f)) 0))
