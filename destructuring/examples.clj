(def artists [:monet :austen])

(let [painter (first artists)
      novelist (second artists)]
      (println "The painter is:" painter
               "and the novelist is:" novelist))

;; destructuring
(let [[painter novelist] artists]
  (println "The painter is:" painter "and the novelist is:" novelist))

(let [[_ novelist] artists]
  (println "The novelist is:" novelist))

(def artist-list '(:monet :austen :beethoven))

(let [[painter novelist] artist-list]
  (println "The painter is:" painter "and the novelist is:" novelist))

(def romeo {:name "Romeo" :age 16 :gender "male"})

(defn add-greeting [{:keys [name age] :as character}]
  (assoc character
    :greeting
    (str "Hello, my name is " name " and I'm " age ".")))

(println (add-greeting romeo))

(println romeo)

(def reader-information [{:name "Charlie", :fav-book {:title "Carrie", :author ["Stephen" "King"]}}
                         {:name "Jennifer", :fav-book {:title "Emma", :author ["Jane" "Austen"]}}])

(defn format-a-name [[_ second-reader]]
  (let [author (-> second-reader :fav-book :author)]
    (str (first author) " " (second author))))

(println (format-a-name reader-information))