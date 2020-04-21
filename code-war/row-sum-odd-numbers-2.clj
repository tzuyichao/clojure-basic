(ns row-sum-odd-numbers.core)

(defn sum [row]
  (let [start 1N
        num (/ (* (+ 1N row) row) 2N)
        end (+ (* 2N (- num 1N)) start)]
    (/ (* num (+ start end)) 2N)))

(defn row-sum-odd-numbers [row-num]
  (- (sum row-num) (sum (- row-num 1N))))

(ns row-sum-sample-tests
  (:require [clojure.test :refer :all]
           [row-sum-odd-numbers.core :refer :all]))

(deftest sample-tests
  (is (= 1 (row-sum-odd-numbers 1)))
  (is (= 125 (row-sum-odd-numbers 5)))
  (is (= 343 (row-sum-odd-numbers 7))))

(run-tests 'row-sum-sample-tests)