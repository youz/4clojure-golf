#(iterate % (% %2))
#(mapcat (juxt count last) (partition-by + %))
