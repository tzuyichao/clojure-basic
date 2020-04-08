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
