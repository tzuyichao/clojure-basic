;; 
(defn sum-copies [input-books]
  (loop [books input-books total 0]
    (if (empty? books)
      total
      (recur 
        (rest books)
        (+ total (:copies-sold (first books)))))))

(def books
  [{:title "Jaws" :copies-sold 2000000}
   {:title "Emma" :copies-sold 3000000}
   {:title "2001" :copies-sold 4000000}])

(println (sum-copies books))