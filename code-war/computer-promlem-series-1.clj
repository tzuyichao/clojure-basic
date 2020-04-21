(ns kata.save)

(defn- can-save-file-count [size hd current result]
  (let [current-file (first size)]
    (if (nil? current-file)
      result
      (if (> (+ current-file current) hd)
        result
        (recur (rest size) hd (+ current-file current) (inc result))
      )
    )
  ))

(defn save [sizes hd]
  (can-save-file-count sizes hd 0 0))

(ns kata.save.test
  (:require [kata.save :refer :all]
            [clojure.test :refer :all]))
(defn tester [sizes hd exp]
  (testing (str "(save [" (clojure.string/join " " sizes) "] " hd ")")
    (is (= (save sizes hd) exp))))
(deftest basic-tests
  (tester [4 4 4 3 3] 12 3)
  (tester [4 4 4 3 3] 11 2)
  (tester [4 8 15 16 23 42] 108 6)
  (tester [13] 13 1)
  (tester [1 2 3 4] 250 4)
  (tester [100] 500 1)
  (tester [11 13 15 17 19] 8 0)
  (tester [45] 12 0))

(run-tests 'kata.save.test)