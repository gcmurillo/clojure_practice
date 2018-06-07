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

  (println "\n3. Function three")
  (defn cadenas[]
    (println "Ingrese primera cadena: ")
    (def c1 (read-line))
    (println "Ingrese segunda cadena: ")
    (def c2 (read-line))

    (if (= c1 c2)
      (println "Las cadenas son iguales.")
      (println "Las cadenas son distintas.")
    )

    (println "La cadena '" c1 "' tiene " (count c1) " caracteres")
    
    (def c3 (str c1 " " c2))
    (println "\"" c3 "\"") 
  )
  (cadenas)

  (println "\n4. Function four")
  (defn guess_number[]
    (println "Hello! What's your name?")
    (def username (read-line))

    (def number (rand-int 15))
    (def counter 0)
    (def parsed 0)
    (loop [guessesTaken 0]
      (when (and (< guessesTaken 6) (not= parsed number))
        (println "Guess a number: ")
        (def guess (read-line))
        (def parsed (Integer/parseInt (re-find  #"\d+" guess)))

        (if (< parsed number)
          (println "Your number is too low")
          (if (> parsed number)
            (println "Your number is too high")   
          )
        )
        (def counter guessesTaken)
        (recur (+ guessesTaken 1))
      )
    )

    (if (= parsed number)
      (println "Good job" username "You guessed the number in" (str counter) "attempts")
      (println "No, the number I had in mind was" (str number))
    )
  )
  (guess_number)
)