(def genres #{:sci-fi :romance :mystery})

(println genres)

;; 重複的值會拿到Duplicate key的Syntax Error
;(def authors #{"Dickens" "Austen" "King" "Austen"})

;(println authors)

(def authors #{"Dickens" "Austen" "King"})

(println "genres contains \"Austen\"? " (contains? genres "Austen"))

(println "authors contains \"Austen\"? " (contains? authors "Austen"))