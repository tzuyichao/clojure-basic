(def list1 [:jar1 1 2 3 :jar2])

(println (first list1))
(println (rest list1))
;; Syntax error (IndexOutOfBoundsException)
;(println (nth list1 -13))
(println (nth list1 3))
;; Syntax error (IndexOutOfBoundsException)
;(println (nth list1 13))

(println (last list1))
