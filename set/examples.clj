(def genres #{:sci-fi :romance :mystery})

(println genres)

;; 重複的值會拿到Duplicate key的Syntax Error
;(def authors #{"Dickens" "Austen" "King" "Austen"})

;(println authors)