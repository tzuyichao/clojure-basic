(ns inventory.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn find-by-title
  "Search for a book by title,
  where title is a string and books is a collection
  of book maps, each of which must have :title entry"
  [title books]
  (some #(when (= (:title %) title) %) books))
