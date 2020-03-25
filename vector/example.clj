(def vec1 (vector true 3 "four" 5))

(def vec2 (vector))

(def novels ["Emma" "Coma" "War and Peace"])

(println "vec1:" vec1)

(println "vec2:" vec2)

(println "novels: " novels)

(println "count of novels: " (count novels))

(println "first novels: " (first novels))

(println "novels: " novels)

(println "rest novels:" (rest novels))

(println "novels: " novels)

(println "index 2 novel is:" (nth novels 2))
(println "index 2 novel is:" (novels 2))
