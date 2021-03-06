(ns difftwo)
; The objective is to return all pairs of integers from a given 
; collection of integers that have a difference of 2.
; The result should be sorted in ascending order.
; The input will consist of unique values. The order of the 
; integers in the input collection should not matter.
; Examples
; [1, 2, 3, 4]      -->  [[1, 3], [2, 4]]
; [4, 1, 2, 3]      -->  [[1, 3], [2, 4]]
; [1, 23, 3, 4, 7]  -->  [[1, 3]]
; [4, 3, 1, 5, 6]   -->  [[1, 3], [3, 5], [4, 6]]

(defn base-pairs [x lst result]
  (let [elem (first lst)]
    (if (not (nil? elem))
      (recur x (rest lst) (conj result (vector x elem)))
      result
    )
  ))

(defn pairs-inner [lst1 lst2 result]
  (let [elem (first lst1)]
    (if (not (nil? elem))
      (recur (rest lst1) lst2 (base-pairs elem lst2 result))
      result
    )
  )
)

(defn pairs [lst1 lst2]
  (pairs-inner lst1 lst2 [])
)

(defn extract-two [operand1-lst operand2-lst result]
  (let [operand1 (first operand1-lst)
        operand2 (first operand2-lst)]
    (if (and (nil? operand1) (nil? operand2))
      result
      (if (nil? operand2)
        (recur (rest operand1-lst) operand2-lst result)
        (if (= (java.lang.Math/abs (- operand1 operand2)) 2)
          (recur operand1-lst (rest operand2-lst) (conj result (vector operand1 operand2)))
          (recur operand1-lst (rest operand2-lst) result)))))
  )

(defn twos-difference [lst]
  (sort #(compare %1 %2) (into [] (filter #(< (first %) (second %)) (filter #(= (java.lang.Math/abs (- (first %) (second %))) 2) (pairs lst lst)))))
  )

(ns difftwo.test
  (:require [clojure.test :refer :all]
            [difftwo :refer [twos-difference]]))
            
(deftest basic-test
  (testing "Basic tests" 
    (is (= [[1 3] [2 4]] (twos-difference [1 2 3 4])))
    (is (= [[1 3] [4 6]] (twos-difference [1 3 4 6])))
    (is (= [[1 3]] (twos-difference [0 3 1 4])))
    (is (= [[1 3] [2 4]] (twos-difference [4 1 2 3])))
    (is (= [[1 3] [3 5] [4 6]] (twos-difference [6 3 4 1 5])))
    (is (= [[1 3] [4 6]] (twos-difference [3 1 6 4])))
    (is (= [[1 3] [3 5] [6 8] [8 10] [10 12] [12 14]] (twos-difference [1 3 5 6 8 10 15 32 12 14 56]))))
  (testing "Edge cases"
    (is (= [] (twos-difference [])))
    (is (= [] (twos-difference [1 4 7 10])))))

(run-tests 'difftwo.test)