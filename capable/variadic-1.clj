(defn print-any-args [& args]
  (println "My arguments are: " args))

(print-any-args 1 "a" 2 true "abcd")

(defn first-argument [& args]
  (first args))

(defn new-first-argument [first & s]
  first)

(println "first-arguemnt:" (first-argument 1 "a" 2 true "abcd"))

(println "new-first-arguemnt:" (new-first-argument 1 "a" 2 true "abcd"))