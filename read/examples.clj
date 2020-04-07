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

(def books1 (with-meta ["Emma" "1984"] {:favorite-books true}))

(println books1)
(println (meta books1))

(def books2 ^:favorite-books ["Emma" "1984"])

(println books2)
(println (meta books2))