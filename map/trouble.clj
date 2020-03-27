(def book {:author "Dickens"
           :title "Hard Times"
           :published 1838})

(println (first book))      ; 我都是第一個，但書上說可能
(println (rest book))       ; 我都是第一個之後的，但書上說可能是別的
(println (count book))