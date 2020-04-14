(ns disemvowel-trolls)

(defn disemvowel
  [string]
  (clojure.string/replace string #"(?i)[aeiou]" "")
)

(println (disemvowel "This website is for losers LOL!"))