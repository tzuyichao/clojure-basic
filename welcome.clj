(defn say-welcome [what]
  (println "Welcome to" what))

(defn average [a b]
  (/ (+ a b) 2.0))

(defn chatty-average [a b]
  (println "chatty-average function called")
  (println "** first argument:" a)
  (println "** second argument:" b)
  (/ (+ a b) 2.0))

(def test '(println "Elixir"))

(say-welcome "Clojure")

(say-welcome (average 5.0 10.0))

(chatty-average 6.0 8.8)

(println test)
(eval test)

(def by-title (agent {}))

(def a '(1 2 3 true "Lucky"))
(def b '(println "Hello!"))

(println (type a))
(println (count a))
(println (first a))
(println (type b))
(println (count b))
(println (first b))