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

  (println "\n2. Function two")
  (defn is_vowel[x]
    (if (or (= x "a") (= x "e") (= x "i") (= x "o") (= x "u"))
      (boolean true)
      (if (or (= x "A") (= x "E") (= x "I") (= x "O") (= x "U"))
        (boolean true)
        (boolean false)
      )
    )
  )
  (println "(is_vowel 'b') ->" (is_vowel "b"))
  (println "(is_vowel 'a') ->" (is_vowel "a"))
  (println "(is_vowel 'E') ->" (is_vowel "E"))
)