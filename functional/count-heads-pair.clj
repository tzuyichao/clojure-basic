(defn count-heads-pair [coll]
  (loop [cnt 0 coll coll]
    (if (empty? coll)
      cnt
      (recur (if (= :h (first coll) (second coll))
        (inc cnt)
        cnt)
        (rest coll))))
  )

(println (count-heads-pair [:h :h :h :t :h]))

(println (count-heads-pair [:h :t :h :t :h]))

