(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    (do
      (println "Preferred customer, free shipping!")
      0.0)
    (do
      (println "Regular customer, charge them for shipping!")
      (* order-amount 0.10))))

(println (shipping-charge true 100.0))
(println (shipping-charge false 100.0))
