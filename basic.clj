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

;; explicit get
(println (get map2 :jam3))
(println (get map2 :jam3 "not found"))
(println (:jam3 map2))
(println (:jam3 map2 "not found"))

;; keys and vals
(println "keys:" (keys map2))
(println "vals:" (vals map2))

;; assoc and dissoc
(def map3 (assoc map2 :jam3 "orange"))
(println "map2:" map2)
(println "map3:" map3)

(def map4 (dissoc map3 :jam3))
(println (= map4 map2))
(def map5 (dissoc map4 :jam3))
(println "after dissoc not exist attribute from map4, (= map5 map4):" (= map5 map4))

;; merge 後面蓋前面
(def map6 (merge {:jam1 "red", :jam2 "black"}
                 {:jam1 "orange", :jam3 "red"}
                 {:jam4 "blue"}))
(println map6)