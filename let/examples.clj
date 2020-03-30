(defn compute-discount-amount-side-effect [amount discount-percent min-charge]
  (def discount-amount (* amount (- 1.0 discount-percent)))
  (if (> discount-amount min-charge)
    discount-amount
    min-charge))

(println (compute-discount-amount-side-effect 10.0 0.1 10.0))
(println discount-amount)

(defn compute-discount-amount [amount discount-percent min-charge]
  (let [discount-amount2 (* amount (- 1.0 discount-percent))])
  (if (> discount-amount min-charge)
    discount-amount
    min-charge))

(println (compute-discount-amount 10.0 0.1 10.0))
;; Unable to resolve symbol: discount-amount2 in this context
;(println discount-amount2)