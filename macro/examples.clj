(defn print-rating [rating]
  (cond
    (pos? rating) (println "Good Book!")
    (zero? rating) (println "Totally indifferenct.")
    :else (println "Run away!")))

(print-rating 10)