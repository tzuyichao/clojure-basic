(ns find-the-odd-int)

;; Given an array, find the integer that appears an odd number of times.
;; There will always be only one integer that appears an odd number of times.

;; (first (filter isOdd? (map count val)))
(defn find-odd [xs]
  nil)

(ns find-the-odd-int-tests
  (:require [clojure.test :refer :all]
            [find-the-odd-int :refer [find-odd]]))

(deftest example-tests
  (are [xs answer] (= (find-odd xs) answer)
    [20 1 -1 2 -2 3 3 5 5 1 2 4 20 4 -1 -2 5] 5
    [1 1 2 -2 5 2 4 4 -1 -2 5] -1
    [20 1 1 2 2 3 3 5 5 4 20 4 5] 5
    [10] 10
    [1 1 1 1 1 1 10 1 1 1 1] 10
    [5 4 3 2 1 5 4 3 2 10 10] 1
    ))

; https://clojure.github.io/clojure/clojure.test-api.html
(run-tests 'find-the-odd-int-tests)