(def artists [:monet :austen])

(let [painter (first artists)
      novelist (second artists)]
      (println "The painter is:" painter
               "and the novelist is:" novelist))

;; destructuring
(let [[painter novelist] artists]
  (println "The painter is:" painter "and the novelist is:" novelist))