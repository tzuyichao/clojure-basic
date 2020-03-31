(def title-seq (seq ["Emma" "Oliver Twist" "Robinson Crusoe" "2012"]))

(println title-seq)

(def sorted-title (sort title-seq))

(println sorted-title)
(println title-seq)
(println (reverse sorted-title))
(println (cons 0 sorted-title))

;; return nil
(println (seq []))
(println (seq '()))
(println (seq {}))