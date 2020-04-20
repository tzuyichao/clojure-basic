; bad idea
(defn stack-consuming-fibo [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (stack-consuming-fibo (- n 1)) (stack-consuming-fibo (- n 2)))))

(println (stack-consuming-fibo 9))

(println (stack-consuming-fibo 1000000))