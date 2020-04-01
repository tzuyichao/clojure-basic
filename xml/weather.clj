(use 'clojure.xml)
;; yahoo weather api is end of service 
(def WEATHER-URI "https://weather.yahooapis.com/forecastrss?w=%d&u=f")

(defn get-location [city-code]
  (for [x (xml-seq (parse (format WEATHER-URI city-code))) :when (= :yweather:location (:tag x))]
    (str (:city (:attrs x)), "," (:region (:attrs x)))))


(println "weather for " (get-location 12770744))