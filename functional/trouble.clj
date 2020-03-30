(defn execute-that-function-later [your-function]
  (println "In execute-that-function-later")
  (Thread/sleep 372)
  (your-function))

(defn execute-that-function-three-times [your-function]
  (doseq [n (range 3)]
    (your-function)))

(execute-that-function-later (fn [] (println "Hello World!")))

(execute-that-function-three-times (fn [] (println "Hello there")))