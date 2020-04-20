(def phone-number "672-345-456-3212")

(def matcher (re-matcher #"((\d+)-(\d+))" phone-number))

(println (re-find matcher))
(println (re-groups matcher))

(def text0 "beer")
(def text1 "1 beer")
(def text2 "1 shot, 5 beers and 1 glass of wine")

(def matcher-text0 (re-matcher #"(\d+)\D*" text0))
(def matcher-text1 (re-matcher #"(\d+)\D*" text1))
(def matcher-text2 (re-matcher #"[0-9]+" text2))

(println (re-find matcher-text0))
(if (not (nil? (re-find matcher-text0)))
  (println (re-groups matcher-text0))
)
(println (re-find matcher-text1))
(println (ffirst (re-groups matcher-text1)))

(println (re-find matcher-text2))
(println (re-find matcher-text2))
(println (re-find matcher-text2))
(println (re-find matcher-text2))

(defn compute-glasses-of-water [str]
  (letfn [(extract [matcher current]
    (let [match (re-find matcher)]
      (if (nil? match)
        current
        (recur matcher (+ current (Integer/parseInt match))))))]
    (extract (re-matcher #"[0-9]+" str) 0)))

(println (compute-glasses-of-water text2))
(println (compute-glasses-of-water text1))