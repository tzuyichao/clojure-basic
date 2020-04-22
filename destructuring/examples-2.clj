(let [[color size] ["blue" :small]]
  (println (str "The " color " door is " size)))

(let [{flower1 :flower1,
       flower2 :flower2 :or {flower2 "missing"}} {:flower1 "red"}]
  (println (str "The flower are " flower1 " and " flower2)))