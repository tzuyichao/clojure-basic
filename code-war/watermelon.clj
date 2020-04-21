(ns kata)
(defn divide [n]
  (and (not (= n 2)) (even? n))
)

(ns kata.test
  (:require [clojure.test :refer :all]
            [kata :refer [divide]]))
(defn tester [n exp]
  (testing (str "(divide " n ")")
    (is (= (divide n) exp))))
(deftest basic-tests
  (tester 4 true)
  (tester 2 false)
  (tester 5 false)
  (tester 88 true)
  (tester 100 true)
  (tester 67 false)
  (tester 90 true)
  (tester 10 true)
  (tester 99 false)
  (tester 32 true))

(run-tests 'kata.test)