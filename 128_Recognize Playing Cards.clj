(fn [[s n]]
  {:suit ({\D :diamond \H :heart} s :club)
   :rank (.indexOf "23456789TJQKA" (int n))
   })
