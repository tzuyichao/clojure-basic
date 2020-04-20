(ns row-sum-odd-numbers.core)

(defn odd-seq [n]
  [1])

(defn row-sum-odd-numbers [row-num] 
  (let [target-seq (odd-seq row-num)]
    (reduce + target-seq)))

(ns row-sum-sample-tests
  (:require [clojure.test :refer :all]
           [row-sum-odd-numbers.core :refer :all]))

(deftest sample-tests
  (is (= 1 (row-sum-odd-numbers 1)))
  (is (= 125 (row-sum-odd-numbers 5)))
  (is (= 343 (row-sum-odd-numbers 7))))

(run-tests 'row-sum-sample-tests)