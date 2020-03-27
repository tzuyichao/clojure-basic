(defn print-greeting [preferred-customer]
  (if preferred-customer
    (println "Welcome back to Blotts Books!")
    (println "Wrlcome to Blotts Books!")))

(print-greeting false)

(print-greeting nil)

(print-greeting "false")

(print-greeting "Test")

(defn shipping-charge [preferred-customer order-amount]
  (if preferred-customer
    0.00
    (* order-amount 0.10)))

(println (shipping-charge true 100.0))

(println (shipping-charge false 100.0))