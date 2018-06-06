(ns practice01.core
  (:gen-class))

(defn -main
  "Geancarlo Murillo - Programming Languages | ESPOL 2018"
  [& args]
  (println "1. Function one")
  (defn max[n1, n2]
    (if (< n1 n2)
      (println n2)
    )
    (if (< n2 n1)
      (println n1)
    )
    (if (= n2 n1)
      (println "They are equals")
    )
  )
  (println "(max 4 4)")
  (max 4 4)
  (println "(max 3 4)")
  (max 3 4)
  (println "(max 4 3)")
  (max 4 3)

  (println "2. Function two")
  (defn is_vowel[x]
    (if (or (= x "a") (= x "e"))
      (boolean true)
      (boolean false)
    )
  )
  (println (is_vowel "b"))
)