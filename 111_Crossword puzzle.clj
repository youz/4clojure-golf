;; * case-sensitive *
(fn [w m]
  (= (some #(.matches w (str "^(" (apply str (replace {\_ \. \# \| \ ""}  %)) ")$"))
           `(~@m ~@(apply map str m)))
     true))
