(def my-map {"title" "Oliver Twist" "author" "Dickens" "published" 1838})

(println my-map)

(def book-title (get my-map "title"))
(def book-author (my-map "author"))

(println "book title:" book-title)
(println "book author:" book-author)