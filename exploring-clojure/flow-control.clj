(ns flow-control)

(defn is-small? [number]
  (if (< number 100) "yes"))

(println (is-small? 50))
(println (is-small? 150))

(defn is-small-2? [number]
  (if (< number 100) "yes" "no"))

(println (is-small-2? 50))
(println (is-small-2? 150))

(defn is-small-3? [number]
  (if (< number 100) 
    "yes"
    (do
      (println "Saw a big number" number)
      "no")))

(println (is-small-3? 50))
(println "----------------")
(println (is-small-3? 150))

; bindings: result is [], x is 10
(println (loop [result [] x 10]
  (if (zero? x)
    result
    (recur (conj result x) (dec x)))))

(defn countdown [result x]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))

(println (countdown [] 6))

(def x (into [] (take 5 (iterate dec 5))))

(println "x:" x)

(def y (into [] (drop-last (reverse (range 6)))))

(println "y:" y)

(def z (vec (reverse (rest (range 6)))))

(println "z:" z)

(println (range 6))
(println (rest (range 6)))
(println (reverse (rest (range 6))))


(defn indexed [coll]
  (map-indexed vector coll))

(println (indexed (str 929)))
(println (+ (Integer/parseInt (String/valueOf (second (first (indexed (str 929)))))) 5))

(println (map #(println %) (str 929)))

(def a1 (map #(Integer/parseInt (String/valueOf %)) (str 929)))
(println "Result:" (reduce + a1))