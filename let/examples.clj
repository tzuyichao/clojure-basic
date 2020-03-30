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

(defn compute-discount-amount2 [amount discount-percent min-charge]
  (let [discount (* amount discount-percent)
        discount-amount (- amount discount)])
  (if (> discount-amount min-charge)
    discount-amount
    min-charge))

(println (compute-discount-amount2 10.0 0.1 4.9))

(def emma {:title "Emma" :author "jane austen"})
(def the-2012 {:title "2012"})

(defn uppercase-author [book]
  (let [author (:author book)]
    (if author
      (.toUpperCase author))))
(println (uppercase-author emma))

(defn uppercase-author2 [book]
  (if-let [author (:author book)]
    (.toUpperCase author)
    "ANONYMOUS"))
(println (uppercase-author2 emma))
(println (uppercase-author2 the-2012))