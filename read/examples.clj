;(read)

(def s
  "(defn print-greeting [preferred-customer]
    (if preferred-customer (println \"Welcome back!\")))")

;(read-string s)

;(eval s)

; Unable to resolve symbol: print-greeting in this context
;(print-greeting true)

(eval (read-string s))

(print-greeting true)