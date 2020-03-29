(defn dispatch-book-format [book]
  (cond
    (vector? book) :vector-book
    (contains? book :title) :standard-book
    (contains? book :book) :alternative-book))

(defmulti normalize-book dispatch-book-format)

(defmethod normalize-book :vector-book [book]
  {:title (first book) :author (second book)})
(defmethod normalize-book :standard-book [book]
  book)
(defmethod normalize-book :alternative-book [book]
  {:title (:book book) :author (:by book)})

(println (normalize-book {:title "War and Prace" :author "Tolstoy"}))

(println (normalize-book {:book "Emma" :by "Austen"}))

(println (normalize-book [1984 "Orwell"]))