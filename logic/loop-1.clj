(println (take 5 (repeat "Hello")))

(def greet
  (fn [whom]
    (println ">>> greet called")
    (str "Hello, " whom "!")))

(println (take 5 (repeat (greet "Test"))))