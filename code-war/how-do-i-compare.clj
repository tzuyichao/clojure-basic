(ns how-do-i-compare)

; identical_q means same object
; 而且有的時候跟Java那邊為了效能做cache有關
; (identical? 42 42) ; true
; (identical? 1764 1764) ; false
(defn what-is [x]
  (cond
    (= x 42) "everything"
    (= x (* 42 42)) "everything squared"
    :else "nothing"))

(ns how-do-i-compare-test
  (:require [clojure.test :refer :all]
            [how-do-i-compare :refer [what-is]]))

(deftest tests
  (are [x answer] (= (what-is x) answer)
    0 "nothing"
    123 "nothing"
    -1 "nothing"
    42 "everything"
    (* 42 42) "everything squared"
  ))

(run-tests 'how-do-i-compare-test)