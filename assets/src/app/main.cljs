(ns app.main)

(def value-a 1)
(defonce value-b 7)

(defn main! []
  (println "App loaded!"))

(defn reload! []
  (println "Code updated.")
  (println "Trying values:" value-a value-b))
