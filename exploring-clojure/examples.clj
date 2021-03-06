(def list1 (quote (1 2 3)))

(def list2 '(1 2 3))

(println (= list1 list2))

(defrecord Book [title author])

(def book1 (->Book "Programming Coljure" "Alex Miller"))

(println book1)

(println "another\nmultiline\nstring")

(println (str \h \e \y \space \y \o \u))

(println (if 0 "zero is true" "zero is false")) ; 0 is true
(println (if nil "nil is true" "nil is false")) ; nil is false
(println "(true? 0):" (true? 0))                ; false
(println "(false? 0):" (false? 0))              ; false
(println "(false? false):" (false? false))      ; true
(println "(false? nil):" (false? nil))          ; false