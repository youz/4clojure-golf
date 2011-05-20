#(take (count %2)
  (drop (mod % (count %2))
	(cycle %2)))
