(println (take 10 (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))

(println (take 10 (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N]))))