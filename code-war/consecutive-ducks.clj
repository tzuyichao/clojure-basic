(ns kata)

(defn is-compose-by-two [n]
  (let [q (quot n 2)]
    (if (= q 1)
      true
      (if (odd? q)
        false
        (recur q)))))

(defn consecutive-ducks [n]
  (or (odd? n) (not (is-compose-by-two n)))
)

(ns kata.test
  (:require [clojure.test :refer :all]
            [kata :refer [consecutive-ducks]]))
(defn tester [n exp]
  (testing (str "Testing for " n)
    (is (= (consecutive-ducks n) exp))))
(deftest check-small-values
  (tester 69 true)
  (tester 8 false)
  (tester 57 true)
  (tester 6 true)
  (tester 13 true)
  (tester 16 false)
  (tester 91 true)
  (tester 75 true)
  (tester 38 true)
  (tester 25 true)
  (tester 32 false)
  (tester 65 true)
  (tester 13 true)
  (tester 16 false)
  (tester 99 true))
(deftest check-medium-values
  (tester 522 true)
  (tester 974 true)
  (tester 755 true)
  (tester 512 false)
  (tester 739 true)
  (tester 1006 true)
  (tester 838 true)
  (tester 1092 true)
  (tester 727 true)
  (tester 648 true)
  (tester 1024 false)
  (tester 851 true)
  (tester 541 true)
  (tester 1011 true)
  (tester 822 true))
(deftest check-large-values
  (tester 382131 true)
  (tester 118070 true)
  (tester 17209 true)
  (tester 32768 false)
  (tester 161997 true)
  (tester 400779 true)
  (tester 198331 true)
  (tester 325482 true)
  (tester 88441 true)
  (tester 648 true)
  (tester 65536 false)
  (tester 323744 true)
  (tester 183540 true)
  (tester 65271 true)
  (tester 5263987 true))

(run-tests 'kata.test)