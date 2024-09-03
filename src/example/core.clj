(ns example.core)


(defn- code
  [m]
  (cheshire.core/parse-string m))


(defn populate-and-code
  ([] (populate-and-code {:a 1}))
  ([m]
   (code (assoc m :b 2 :c 3))))
