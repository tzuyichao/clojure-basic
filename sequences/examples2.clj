(println (every? odd? [1 3 5]))

(println (every? odd? [1 3 5 8]))

(println (some even? [1 3 5]))

(println (some even? [1 3 5 8]))

; transform sequences
(println (map #(format "<p>%s</p>" %) ["the" "quick" "brown" "fox"]))

(println (sort > [42 1 7 11]))