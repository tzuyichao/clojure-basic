(ns printer.core)

;;  a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
; #Examples:
; s="aaabbbbhaijjjm"
; error_printer(s) => "0/14"
; s="aaaxbbbbyyhwawiwjjjwwm"
; error_printer(s) => "8/22"
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