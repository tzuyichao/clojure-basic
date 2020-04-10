(ns war-games)

(defn- play-games? []
  (println "Shall we play a game?"))

(defn hello [who]
  (println "Hello," who)
  (play-games?))