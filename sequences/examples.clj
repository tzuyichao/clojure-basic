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

(def cheap?
  (fn [book]
    (when (<= (:price book) 9.99)
      book)))

(println "cheap books:" (filter cheap? books))

(if (some cheap? books)
  (println "We have cheap books for sale!"))

(println (map (fn [book] (count (:title book))) books))

(defn hi-price [hi book]
  (if (> (:price book) hi)
    (:price book)
    hi))

(println (reduce hi-price 0 books))

(println (str (interpose " // " (map :title (take 3 (reverse (sort-by :rating books)))))))
(println (apply str (interpose " // " (map :title (take 3 (reverse (sort-by :rating books)))))))

(apply (fn [& x] (println x)) (interpose " // " (map :title (take 3 (reverse (sort-by :rating books))))))

(defn format-top-titles [books]
  (->>
    books
    (sort-by :rating)
    reverse
    (take 3)
    (map :title)
    (interpose " // ")
    (apply str)))

(println (format-top-titles books))

(defn find-by-title
  "Search for a book by title,
  where title is a string and books is a collection
  of book maps, each of which must have :title entry"
  [title books]
  (some #(when (= (:title %) title) %) books))

(println (find-by-title "Emma" books))