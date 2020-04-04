(defprotocol Person
  (full-name [this])
  (greeting [this msg])
  (description [this]))

(defrecord SuperComputer [cpu no-cpus storage-db])

(defrecord FictionalCharacter [name appears-in author]
  Person
  (full-name [this] (:name this))
  (greeting [this msg] (str msg " " (:name this)))
  (description [this] (str (:name this) " is a character in " (:appears-in this))))

(defrecord Employee [first-name last-name department]
  Person
  (full-name [this] (str (:first-name this) " " (:last-name this)))
  (greeting [this msg] (str msg " " (:first-name this)))
  (description [this] (str (:first-name this) " works in " (:department this))))

(def watson (->FictionalCharacter "John Watson" "Sign of the Four" "Doyle"))

(def watson-2 (->SuperComputer "Power7" 2880 4000))

(def sofia (->Employee "Sofia" "Diego" "Finance"))

(println (description watson))

(println (description sofia))

;; No implementation of method: :description of protocol: #'user/Person found for class: user.SuperComputer
;(println (description watson-2))

(defprotocol Marketable
  (make-slogan [this]))

(extend-protocol Marketable
  Employee
    (make-slogan [employee] (str (:first-name employee) " is the BEST employee!"))
  FictionalCharacter
    (make-slogan [fictional-character] (str (:name fictional-character) " is the GREATEST character!"))
  String
    (make-slogan [s] (str \" s \" " is a string! NOW!")))

(println (make-slogan sofia))
(println (make-slogan watson))
(println (make-slogan "test"))
;; No implementation of method: :make-slogan of protocol: #'user/Marketable found for class: user.SuperComputer
;(println (make-slogan watson-2))