(println (map inc [1 2 3]))

;; function return function
(println (map (partial + 42) [1 2 3]))

;; anonymous function
(println (map (fn [x] (+ x 42)) [1 2 3]))

(defn register [] 
  "register")
(defn checkout [] 
  "checkout")
(defn pay [] 
  "pay")
(println ((nth [register checkout pay] 1)))