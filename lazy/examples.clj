
(def repeated-text (repeat "Jack"))

(println (first repeated-text))

(println (take 20 repeated-text))

(println (take 7 (cycle [1 2 3])))