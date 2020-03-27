(defmacro minimal-macro [] 
  '(println "I'm trapped inside a macro!"))

(defn minimal-function []
  (println "I'm trapped inside a function!"))

(minimal-macro)

(minimal-function)

(println (macroexpand '(minimal-function)))

(println (macroexpand '(minimal-macro)))