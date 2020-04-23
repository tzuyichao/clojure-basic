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

(defn by-pairs [coll]
  (let [take-pair (fn [c]
                     (when (next c) (take 2 c)))]
    (lazy-seq
      (when-let [pair (seq (take-pair coll))]
        (cons pair (by-pairs (rest coll)))))))

(println (by-pairs [:h :h :h :t :h]))

(println (partition 2 [:h :h :h :t :h]))

(println (partition 2 1 [:h :h :h :t :h]))