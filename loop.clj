(def seq1 (for [x [0 1 2 3 4 5]
               :let [y (* x 3)]
               :when (even? y)]
  y))

(println seq1)
