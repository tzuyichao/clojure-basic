; from book says better but not great
(defn recur-fibo [n]
  (letfn [(fib [current next n]
    (if (zero? n)
      current
      (recur next (+ current next) (dec n))))]
    (fib 0N 1N n)))

(println (recur-fibo 9))
(println (recur-fibo 1000000))