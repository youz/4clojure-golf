(fn[s](apply str(interpose\,(filter #(some(fn[i](=(* i i)%))(range%))(map bigint(re-seq #"\d+"s))))))