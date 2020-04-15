(ns digital-root)

(defn is-digital-root-completed? [n]
  (= (count (str n)) 1))

(defn convert-to-integer-sequence [n]
  (map #(Integer/parseInt (String/valueOf %)) (str n)))

(defn solve [n]
  (if (is-digital-root-completed? n)
    n
    (recur (reduce + (convert-to-integer-sequence n))))
)

(defn digital-root [n]
  (solve n)
)

(ns digital-root-test
  (:require [clojure.test :refer :all]
            [digital-root :refer :all]))

(deftest digital-root-example-test
  (is (= (digital-root 16) 7))
  (is (= (digital-root 456) 6)))

(run-tests 'digital-root-test)