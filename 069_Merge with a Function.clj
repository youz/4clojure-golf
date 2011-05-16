(fn[f & r](reduce #(reduce(fn[a[k v]](conj a(if-let[b(a k)]{k(f b v)}{k v})))%%2)r))
