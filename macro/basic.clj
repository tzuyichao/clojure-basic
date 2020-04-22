(defmacro parameterized-with-syntax [n-times s]
  `(do ~@(repeat n-times `(println ~s))))

(println (macroexpand '(parameterized-with-syntax 3 "Syntax quoting!")))

(parameterized-with-syntax 3 "Testing!")