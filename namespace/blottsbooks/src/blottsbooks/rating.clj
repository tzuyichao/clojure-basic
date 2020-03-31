(ns blottsbooks.rating)

(def rating-book
  (fn [book]
    (update book :rating inc)))