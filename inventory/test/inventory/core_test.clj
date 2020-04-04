(ns inventory.core-test
  (:require [clojure.test :refer :all])
  (:require [inventory.core :as inventory]))

(def books
  [{:title "2001" :author "Clarke" :copies 21}
   {:title "Emma" :author "Austen" :copies 10}
   {:title "Misery" :author "King" :copies 101}])

(deftest test-finding-books
  (println (inventory/find-by-title "Emma" books))
  (is (not (nil? (inventory/find-by-title "Emma" books)))))
