(ns aretheysame.core)
; 只有說不管順序 沒說不在乎出現次數 所以弄成set會誤判某些情境
(require 'clojure.set)

(defn exp [x]
  (map #(* % %) x))

(defn compSame [a b]
  (let [xa (set (exp a))
        xb (set b)]
        (if (or (nil? b) (nil? a) (nil? xb) (nil? xa))
        false
        (clojure.set/subset? xb xa)))
)

(ns aretheysame.core-test
  (:require [clojure.test :refer :all]
            [aretheysame.core :refer :all]))


(deftest a-test1
  (testing "Test 1"
    (def ur [121, 144, 19, 161, 19, 144, 19, 11])
    (def vr [121, 14641, 20736, 361, 25921, 361, 20736, 361])
    (is (= (compSame ur vr) true))))

(deftest a-test2
  (testing "Test 1"
    (def ur nil)
    (def vr [121, 14641, 20736, 361, 25921, 361, 20736, 361])
    (is (= (compSame ur vr) false)))
  (testing "Test 2"
    (def ur [121, 144, 19, 161, 19, 144, 19, 11])
    (def vr nil)
    (is (= (compSame ur vr) false))))

(deftest a-test3
  (testing "Test 1"
    (def ur [121, 144, 19, 161, 19, 144, 19, 11])
    (def vr [7, 121, 14641, 20736, 361, 25921, 361, 20736, 361])
    (is (= (compSame ur vr) false))))

(run-tests 'aretheysame.core-test)