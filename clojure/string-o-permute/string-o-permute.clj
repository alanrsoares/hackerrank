(require '[clojure.string :as str])

(def input (str/split-lines (slurp *in*)))

(def parse-int #(Integer. (re-find #"\d+" %)))

(def to-lines #(str/join "\n" %))

(defn permute [n w]
    (apply str (map (fn [[a b]] (apply str [b a])) (partition n w))))

(let [[n & rest] input]
    (let [size (parse-int n)]
        (print (to-lines (map #(permute size %) rest)))))
