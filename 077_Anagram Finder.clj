#(->> %
  (group-by sort) vals (filter next) (map set) set)
