(ns printer.core)

;;  a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
; #Examples:
; s="aaabbbbhaijjjm"
; error_printer(s) => "0/14"
; s="aaaxbbbbyyhwawiwjjjwwm"
; error_printer(s) => "8/22"
(defn printer-error [s]
  (let [total (count s)
        bad-count (count (clojure.string/replace s #"[a-m]" ""))]
        (str bad-count "/" total))
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

(deftest a-test2
  (testing "printer-error2"
    (def u "aaaxbbbbyyhwawiwjjjwwm")
    (test-assert(printer-error u) "8/22")
))

(run-tests 'printer.core-test)