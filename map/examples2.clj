(def book
  {:title "Oliver Twist" :author "Dickens" :published 1838})

(println book)
(println "Title:" (book :title))
(println "Author:" (book :author))
(println "Published:" (:published book))

(def book-more-info (assoc book :page-count 362))
(println "book: " book)
(println "book-more-info: " book-more-info)

(def book-remove-published (dissoc book :published :youcanfindme))
(println "book: " book)
(println "book-remove-published: " book-remove-published)
