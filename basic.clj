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

;; duplicate key
;(println {:a 1, :b 2, :a 1})

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

;; set
(def set1 #{})
(println set1)

(def set2 #{:r :b :w})
(def set3 #{:w :p :y})
(use 'clojure.set)
(println "set2:" set2)
(println "set3:" set3)
(println "union:" (clojure.set/union set2 set3))
(println "difference:" (clojure.set/difference set2 set3))
(println "intersection:" (clojure.set/intersection set2 set3))

(def set4 (set {:a 1, :b 2, :c 3}))
(println set4)

;; get

(println (get set2 :b))
(println (get set2 :g))
(println (:b set2))
(println (:g set2))

(println (contains? set2 :b))
(println (contains? set2 :g))

;; conj and disj
(def set5 (conj set2 :jam))
(println set5)

(def set6 (disj set5 :jam))
(println (= set6 set2))

;; quot and "/" 不相等 from https://clojuredocs.org/clojure.core/quot
(println (= (/ 4 2) (quot 4 2)))
(println (= (/ 3 2) (quot 3 2)))
(println (/ 3 2))
(println (quot 3 2))

(def map1 (zipmap [:a :b :c] [1 2 3]))

(def map2 (zipmap [:a :b :c :d] [1 2 3]))

(def map3 (zipmap [:a :b :c] [1 2 3 4]))

(println map1)
(println map2)
(println map3)