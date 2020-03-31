(ns blottsbooks.core
  (:require blottsbooks.pricing)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (blottsbooks.pricing/discount-price {:title "Emma", :price 9.9})))
