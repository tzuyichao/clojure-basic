(println "A function:" (fn [n] (* 2 n)))
(def double-it (fn [n] (* 2 n)))
(println "double 3 is" (double-it 3))

(def dracula {:title "Dracula"
              :author "Stoker"
              :price 1.99
              :genre :horror})

(defn cheaper-f [max-price]
  (fn [book]
    (when (<= (:price book) max-price)
      book)))

(def real-cheap? (cheaper-f 1.00))
(def kind-of-cheap? (cheaper-f 1.99))

(println (real-cheap? dracula))
(println (kind-of-cheap? dracula))

;; function literal
(def double-it-2 #(* 2 %1))
(println (double-it-2 7))
