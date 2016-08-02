(defn compressor [xs x]
    (if (= x (:char (last xs)))
            (update-in xs [(dec (count xs)) :len] inc)
                    (conj xs {:char x :len 1})))

(defn to-string [{:keys [char len]}]
    (str char (if (> len 1) len)))

(def compress
    #(apply str (map to-string (reduce compressor [] %))))
