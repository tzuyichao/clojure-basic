(println (take 5 (repeat "Hello")))

(def greet
  (fn [whom]
    (println ">>> greet called")
    (str "Hello, " whom "!")))

(println (take 5 (repeat (greet "Test"))))

(def default-profile (zipmap [:score :hits :friends :level :energy :boost] (repeat 0)))

(println default-profile)