(def foo 10)

(println (var foo))

(println #'foo)

; Unable to resolve var: foo-not-exist in this context
;(println (var foo-not-exist))

(ns testing)

(def foo "text")

(println (var foo))

(println #'foo)