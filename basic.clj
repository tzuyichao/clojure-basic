(ns mylab)

(defn testing [str]
  (every? #(Character/isWhitespace %) str))

(println (testing "   "))
(println (testing "   12 "))

;; cons
(def r1 (cons 3 (cons 4 (cons 5 nil))))

(println r1)

(def uuid1 (java.util.UUID/randomUUID))

(println uuid1)