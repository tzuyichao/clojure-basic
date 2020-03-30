(def book {:title "Emma" :copies 1000})

(def new-book (update book :copies inc))

(println "book:" book)
(println "new-book:" new-book)

(def by-author
  {:name "Jane Austen"
   :book {:title "Emma" :copies 1000}})

(def by-author2
  {:name "Jane Austen"
   :emma {:title "Emma" :copies 1000} 
   :s-and-s {:title "Sense and Sensibility" :copies 10000}})

(def new-by-author (update-in by-author [:book :copies] inc))

(println by-author)
(println new-by-author)

;;(def new-by-author2 (map (fn [x] (update x :copies inc)) (:books by-author2)))
(def new-by-author2 (update-in by-author2 [:emma :copies] inc))

(println by-author2)
(println new-by-author2)

(def new-by-author2-1 (assoc-in by-author2 [:emma :copies] 10002))
(println by-author2)
(println new-by-author2-1)