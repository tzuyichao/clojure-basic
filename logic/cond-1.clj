(defn shipping-charge [preferred-customer order-amount]
  (cond 
    preferred-customer 0.0
    (< order-amount 50.0) 5.0
    (< order-amount 100.0) 10.0
    (>= order-amount 100.0) (* 0.1 order-amount)))

(println (shipping-charge true 32.0))
(println (shipping-charge false 48.0))
(println (shipping-charge false 78.0))
(println (shipping-charge false 148.0))