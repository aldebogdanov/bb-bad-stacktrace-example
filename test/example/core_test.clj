(ns example.core-test
  (:require
    [clojure.test :refer [is deftest]]
    [example.core :as ex]))


(deftest example
  (is (= "{\"a\": 1, \"b\": 2, \"c\": 3}" (ex/populate-and-code {:a 1}))))
