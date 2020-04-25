(require '[clojure.spec.alpha :as s])

(s/def :user/name string?)

(println (s/valid? :user/name "Test"))

(println (s/valid? :user/name 1))

(s/def :user/ranged-roll (s/int-in 1 7))

(println (s/valid? :user/ranged-roll 0))
(println (s/valid? :user/ranged-roll 3))
(println (s/valid? :user/ranged-roll 6))
(println (s/valid? :user/ranged-roll 7))

(println "done")