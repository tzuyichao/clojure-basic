(defrecord FictionalCharacter [name appears-in author])

(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))

(println watson)

(println (:name watson))

(println (count watson))

(println (keys watson))

(def another-watson (assoc watson :appears-in "Sherlock Holmes"))

(println "watson:" watson)

(println "another-watson:" another-watson)