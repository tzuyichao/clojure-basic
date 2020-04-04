(defrecord FictionalCharacter [name appears-in author])

(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))

(println watson)

(println (:name watson))

(println (count watson))

(println (keys watson))

(def another-watson (assoc watson :appears-in "Sherlock Holmes"))

(println "watson:" watson)

(println "another-watson:" another-watson)

(defrecord SuperComputer [cpu no-cpus storage-db])

(def watson-2 (map->SuperComputer {:cpu "Power7" :no-cpus 2880 :storage-db 4000}))

(println (class watson))
(println (class watson-2))

(println (instance? FictionalCharacter watson))
(println (instance? SuperComputer watson))
