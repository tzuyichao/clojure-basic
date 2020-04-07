(defn print-rating [rating]
  (cond
    (pos? rating) (println "Good Book!")
    (zero? rating) (println "Totally indifferenct.")
    :else (println "Run away!")))

(print-rating 10)

(defn arithmetic-if [rating pos zero neg]
  (cond
    (pos? rating) pos
    (zero? rating) zero
    (neg? rating) neg))

(defn print-rating-v2 [rating]
  (arithmetic-if rating
    (println "Good Book!")
    (println "Totally indifferenct.")
    (println "Run away!")))
  
(print-rating-v2 0)

(defn arithmetic-if-fix1 [rating pos-f zero-f neg-f]
  (cond
    (pos? rating) (pos-f)
    (zero? rating) (zero-f)
    (neg? rating) (neg-f)))

(defn print-rating-v2-fix1 [rating]
  (arithmetic-if-fix1 rating
    #(println "Good Book!")
    #(println "Totally indifferenct.")
    #(println "Run away!")))

(print-rating-v2-fix1 0)

(defmacro arithmetic-if-m [n pos zero neg]
  (list 'cond (list 'pos? n) pos
              (list 'zero? n) zero
              :else neg))

(arithmetic-if-m 10 :loved-it :meh :hated-it)

(defmacro print-it [message]
  (list 'println "Something is" message))

(print-it "test")

(def test-list `(:a :syntax "quoted" :list 1 2 3 4))
(println test-list)

(def n 100)
(def test-list-2 `(n :qq))
(println test-list-2)

(def test-list-3 `(~n :qq))
(println test-list-3)