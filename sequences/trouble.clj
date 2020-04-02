(def books 
  [{:title "Deep Six" :price 13.99 :genre :sci-fi :rating 6 :sales 300}
   {:title "Dracula" :price 1.99 :genre :horror :rating 7 :sales 500}
   {:title "Emma" :price 7.99 :genre :comedy :rating 9 :sales 200}
   {:title "2001" :price 10.50 :genre :sci-fi :rating 5 :sales 700}])

(defn total-sales [books]
  "Total up book sales. Books map must have :sales key"
  (loop [books books total 0]
    (if (empty? books)
      total
      (recur (next books)
        (+ total (:sales (first books)))))))

(println (total-sales books))

(defn total-sales-functional-way [books]
  (apply + (map :sales books)))

(println (total-sales-functional-way books))

(println (conj ["Emma" "1984" "The Maze Runner"] "Jaws"))

(println (conj '("Emma" "1984" "The Maze Runner") "Jaws"))

(println (cons ["Emma" "1984" "The Maze Runner"] "Jaws"))

(println (cons '("Emma" "1984" "The Maze Runner") "Jaws"))

(println (cons "Jaws" ["Emma" "1984" "The Maze Runner"]))

(println (cons "Jaws" '("Emma" "1984" "The Maze Runner")))