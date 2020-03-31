(def discount-rate 0.12)

(ns pricing)

(def discount-rate 0.15)

(def discount-price
  (fn [book]
    (* (- 1.0 discount-rate) (:price book))))

(ns user)
(def emma {:title "Emma" :price 9.99})
(println "Using pricing/discount-price:" (pricing/discount-price emma))
(println "In user namespace:" (* (- 1.0 discount-rate) (:price emma)))