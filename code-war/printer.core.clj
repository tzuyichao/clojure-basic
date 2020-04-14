(ns printer.core)

(defn printer-error [s]
  ; your code
  ) 

(ns printer.core-test
  (:require [clojure.test :refer :all]
            [printer.core :refer :all]))

(defn test-assert [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "printer-error"
   (def u "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
   (test-assert(printer-error u) "3/56")
))

(run-tests 'printer.core-test)