(defn grow [name direction]
  (if (= direction :small)
    (str name " is growing smaller")
    (str name " is growing bigger")))

(println (grow "Tom" :small))

(def tommy (partial grow "Tommy"))

(println (tommy :bigger))