(defn greeting
  "Returns a greeting of the form 'Hello, username.'
  Default username is 'world'"
  ([] (greeting "world"))
  ([username] (str "Hello, " username ".")))

(println (greeting "Tom"))

(println (greeting))

;(doc greeting)

(defn date [person-1 person-2 & chaperones]
  (println person-1 "and" person-2 "went out with" (count chaperones) "chaperones."))

(date "Romeo" "Juliet" "Friar Lawrence" "Nurse")

(require '[clojure.string :as str])

(println (filter (fn [w] (> (count w) 2)) (str/split "A fine day" #"\W+")))

(println (filter #(> (count %) 2) (str/split "A find day" #"\W+")))

(defn indexable-words [text]
  (let [indexable-word? (fn [w] (> (count w) 2))]
    (filter indexable-word? (str/split text #"\W+"))))

(println (indexable-words "A fine day"))