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

(def seq1 '(1 -22 3 -99 4 5 6 -7))

(println "seq1:" seq1)
(println "filtered seq:" (filter neg? seq1))

(def books 
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5}])

(println "map books with :title to title sequence:" (map :title books))

(def cheep?
  (fn [book]
    (when (<= (:price book) 9.99)
      book)))

(println "cheep books:" (filter cheep? books))