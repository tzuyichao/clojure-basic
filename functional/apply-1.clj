(def the-function +)
(def args [1 2 3 4 5])

(println "apply demo:" (apply the-function args))

(defn my-inc-1 [n] (+ 1 n))
(def my-inc-2 (partial + 1))

(println (my-inc-1 41))
(println (my-inc-2))            ;; [] (f arg1)
(println (my-inc-2 41))         ;; [x] (f arg1 x)
(println (my-inc-2 41 42 43))   ;; [x y z] (f arg1 x y z)

(println (/ (* 80000 30) 10000.0))

;; partial return function call. in this example apply (partial f arg1)
(println (partial + 1))