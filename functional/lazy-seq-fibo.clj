(defn lazy-seq-fibo
  ([]
    (concat [0 1] (lazy-seq-fibo 0N 1N)))
  ([a b]
    (let [n (+ a b)]
      (lazy-seq (cons n (lazy-seq-fibo b n))))))
    
(println (take 10 (lazy-seq-fibo)))

(println (nth (lazy-seq-fibo) 9))

(println (nth (lazy-seq-fibo) 1000000))
