(ns blottsbooks.core
  (:require [blottsbooks.pricing :as pricing])
  (:require [blottsbooks.rating :refer [rating-book]])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (rating-book {:title "Emma" :price 9.9 :rating 10}))
  (println (pricing/discount-price {:title "Emma", :price 9.9})))
