(def the-function +)
(def args [1 2 3 4 5])

(println "apply demo:" (apply the-function args))

(defn my-inc-1 [n] (+ 1 n))
(def my-inc-2 (partial + 1))

(println (my-inc-1 41))
(println (my-inc-2 41))