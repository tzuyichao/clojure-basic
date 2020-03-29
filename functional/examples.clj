(def dracula {:title "Dracula"
              :author "Stoker"
              :price 1.99
              :genre :horror})
(def dracula2 {:title "Dracula2"
              :author "Stoker"
              :price 21.99
              :genre :horror})
(def testbook {:title "Test"})

(defn cheap? [book]
  {:pre [(:price book)]}
  (when (<= (:price book) 9.99)
    book))

(defn cheap2? [book]
  {:pre [(:price book)]
   :post [(boolean? %)]}
  (if (<= (:price book) 9.99)
    true
    false))

(println (cheap? dracula))
(println (cheap? dracula2))

(println (cheap2? dracula))
(println (cheap2? dracula2))

;; Assert failed: (:price book)
;(println (cheap? testbook))