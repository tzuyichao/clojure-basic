(require '[clojure.java.io :as io])

(def AUTHOR-FILE "authors.txt")

(defn print-file [file]
  (with-open [r (io/reader file)]
    (println (line-seq r))))

(defn listed-author? [author]
  (with-open [r (io/reader AUTHOR-FILE)]
    (some (partial = author) (line-seq r))))

(print-file AUTHOR-FILE)
(println "listed-author? \"Austen\": " (listed-author? "Austen"))
(println "listed-author? \"Terence\": " (listed-author? "Terence"))