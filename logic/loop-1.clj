(println (take 5 (repeat "Hello")))

(def greet
  (fn [whom]
    (println ">>> greet called")
    (str "Hello, " whom "!")))

(println (take 5 (repeat (greet "Test"))))

(def default-profile (zipmap [:score :hits :friends :level :energy :boost] (repeat 0)))

(println default-profile)

(println (rand-int 100))

(println (take 10 (repeatedly (partial rand-int 100))))

(println "get 5 random numner" (repeatedly 5 (partial rand-int 50)))