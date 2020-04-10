(ns mylab)

(defn testing [str]
  (every? #(Character/isWhitespace %) str))

(println (testing "   "))
(println (testing "   12 "))

;; cons
(def r1 (cons 3 (cons 4 (cons 5 nil))))

(println r1)

(def uuid1 (java.util.UUID/randomUUID))

(println uuid1)

(println (uuid? uuid1))

(println (conj '(:toast :butter) :jam :honey))

;; map

(def map1 {:jam1 "strawberry", :jam2 "blackberry"})
(def map2 {:jam1 "strawberry" :jam2 "blackberry"})

(println map1)
(println map2)
(println (= map1 map2))