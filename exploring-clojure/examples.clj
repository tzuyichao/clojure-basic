(def list1 (quote (1 2 3)))

(def list2 '(1 2 3))

(println (= list1 list2))

(defrecord Book [title author])

(def book1 (->Book "Programming Coljure" "Alex Miller"))

(println book1)