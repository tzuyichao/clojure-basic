;; Vector Example
(def vec1 [:jar1 1 2 3 :jar2])

(println (type vec1))

(println (first vec1))
(println (rest vec1))
;; Syntax error (IndexOutOfBoundsException)
;(println (nth vec1 -13))
(println (nth vec1 3))
;; Syntax error (IndexOutOfBoundsException)
;(println (nth vec1 13))

(println (last vec1))

;; List Example
(def list1 '(:jar1 1 2 3 :jar2))

(println (type list1))

(def list2 (list println "Hello"))
(def list3 '(println "Hello"))

(println list2)
(println list3)

(println (type list2))
(println (type list3))

(eval list2)
(eval list3)

