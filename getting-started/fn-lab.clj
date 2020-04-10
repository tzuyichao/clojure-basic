;; https://clojuredocs.org/clojure.core/ifn_q
;; Returns true if x implements IFn. Note that many data structures
;; (e.g. sets and maps) implement IFn
(println (ifn? "println"))

(println (ifn? 'println))

(println (ifn? println))

(println (ifn? :println))

(println (ifn? 1))

(println (ifn? #(println "I'm anonymnous function")))

; (#(println "I'm anonymnous function"))
