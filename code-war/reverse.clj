(ns reverse
  (:refer-clojure :exclude [reverse]))

(defn reverse-seq [seqx result]
  (let [elem (first seqx)]
    ;(println result)
    (if (not (nil? elem))
      (recur (rest seqx) (conj result elem))
      result
    )))

(defn reverse
  "Reverse a list"
  [lst]
  (reverse-seq lst '())
)

(ns reverse-test
  (:require [clojure.test :refer :all]
            [reverse :as reverse]))

(deftest test-reverse-function
  (let [input1 [1 9 13 1 99 9 9 13]
        input2 (repeatedly (+ 5 (rand-int 10)) #(rand-int 100))
        input3 "\"There are only two kinds of languages: the ones people complain about and the ones nobody uses\" - Bjarne Stroustrup"]
    
    (testing (str input1)
      (is (= (reverse/reverse input1) (reverse input1))))
    
    (testing (str input2)
      (is (= (reverse/reverse input2) (reverse input2))))
    
    (testing (str "String: " (prn-str input3))
      (is (= (reverse/reverse input3) (reverse input3))))
      
    (testing "[]"
      (is (= (reverse/reverse []) [])))
        
    (testing "[1]"
      (is (= (reverse/reverse [1]) [1])))))

(run-tests 'reverse-test)