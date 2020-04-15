(ns calling-java)

(def r1 (new java.util.Random))

(println r1)

(def r2 (java.util.Random.))

(println r2)

(println (. r1 nextInt))

(println (. r1 nextInt 20))

(println (.nextInt r1 20))

(import '(java.util Random Locale)
        '(java.text MessageFormat))

(def form (new MessageFormat "The disk \"{1}\" contains {0} file(s)."))

(println (.format form (.toArray [123 "myDisk"])))