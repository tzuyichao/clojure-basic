(def PI 3.14)
(def ^:dynamic debug-enabled false)

(defn book-description [book]
  (str (:title book) " written by " (:author book)))

(def book-desc
  (fn [book]
    (str (:title book) " written by " (:author book))))

(defn debug [msg]
  (if debug-enabled
    (println msg)))

(binding [debug-enabled true]
  (debug "Calling..."))

(debug "you cannot see me") 