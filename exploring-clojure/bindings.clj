(def foo 10)

(println (var foo))

(println #'foo)

(ns testing)

(def foo "text")

(println (var foo))

(println #'foo)