(require '[clojure.string :as str])

(def to-lines #(str/join "\n" %))

(defn permute [w]
    (apply str (map (fn [[a b]] (apply str [b a])) (partition 2 w))))

(let [[n & rest] (str/split-lines (slurp *in*))]
    (print (to-lines (map permute rest))))
