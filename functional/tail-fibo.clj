; BigInt (which is printed with a trailing N)
(defn tail-fibo [n]
  (letfn [(fib [current next n]
    (if (zero? n)
      current
      (fib next (+ current next) (dec n))))]
    (fib 0N 1N n)))

(println (tail-fibo 9))
(println (tail-fibo 1000))
; StackOverflow
(println (tail-fibo 10000))