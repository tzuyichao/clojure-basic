(ns hydrate)

(defn compute-glasses-of-water [str]
  (letfn [(extract [matcher current]
    (let [match (re-find matcher)]
      (if (nil? match)
        current
        (recur matcher (+ current (Integer/parseInt match))))))]
    (extract (re-matcher #"[0-9]+" str) 0)))

(defn hydrate [drink-string]
  (let [glasses-of-water (compute-glasses-of-water drink-string)]
    (if (> glasses-of-water 1)
      (str glasses-of-water " glasses of water")
      (str glasses-of-water " glass of water")))
)

(ns hydrate-test
  (:require [clojure.test :refer :all]
            [hydrate :refer :all]))

(deftest hydrate-test1
  (def text "1 beer")
  (def expected "1 glass of water")
  (def actual (hydrate text))
  (is (= actual expected)))

(deftest hydrate-test3
  (def text "1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer")
  (def expected "10 glasses of water")
  (def actual (hydrate text))
  (is (= actual expected)))

(run-tests 'hydrate-test)