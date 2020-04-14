(ns disemvowel-trolls)

(defn disemvowel
  [string]
  (clojure.string/replace string #"[aeiouAEIOU]" "")
)