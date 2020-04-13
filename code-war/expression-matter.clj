(ns expression.matter)

(defn make-expressions [a b c]
  (let [expression-templates [
    "(* (+ %d %d) %d)"
    "(* %d (+ %d %d))"
    "(+ %d %d %d)"
    "(* %d %d %d)"
  ]]
  (map #(format % a b c) expression-templates)))

(defn eval-expression-list [a b c]
  (let [expression-list (make-expressions a b c)]
  (map #(eval (read-string %)) expression-list)))


(defn expression-matter [a b c]
  (apply max (eval-expression-list a b c))
)

(println (expression-matter 2 1 2))

(println (expression-matter 5 6 1))

;(println (eval-expression-list 2 1 2))

;(println (make-expressions 2 1 2))