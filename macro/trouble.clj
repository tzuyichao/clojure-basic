(defmacro mark-the-times []
  (println "This is code that runs when the macro is expanded.")
  `(println "This is generated code."))

(defn use-the-macro []
  (mark-the-times))

(use-the-macro)
(use-the-macro)

(println "macroexpand-1 result:")
(println (macroexpand-1 '(mark-the-times)))