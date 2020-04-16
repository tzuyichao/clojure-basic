(ns how-do-i-compare)

(defn what-is [x]
  (cond
    (identical? x 42) "everything"
    (identical? x (* 42 42)) "everything squared"
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