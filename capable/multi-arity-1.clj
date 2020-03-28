(defn greet
  ([to-whom] (println "Welcome to Blotts Books" to-whom))
  ([message to-whom] (println message to-whom)))

(greet "Test")
(greet "Hello, World!" "Test")