(fn r([f c](lazy-seq(r f(first c)(rest c))))([f i c](cons i(if(seq c)(lazy-seq(r f(f i(first c))(rest c)))))))