(letfn [(six-times [y]
          (* (twice y) 3))
        (twice [x]
          (* x 2))]
  (println "Twice 15 =" (twice 15)
  (println "Six times 15 =" (six-times 15))))

