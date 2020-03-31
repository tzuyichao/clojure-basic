(ns blottsbooks.pricing)

(def discount-rate 0.15)

(def discount-price
  (fn [book]
    (- (:price book) (* discount-rate (:price book)))))
