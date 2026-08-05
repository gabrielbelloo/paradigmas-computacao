(defn tabuada [n]
  (doseq [i (range 1 11)]
    (println (str n " x " i " = " (* n i)))))

(tabuada 5)