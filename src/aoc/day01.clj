(ns aoc.day01
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

;; plan:
;; step one open the data file
;;          read one line at a time
;;          parse the value on the line (+/-)
;;          add that to the running total
;; that is the result

(def frequency-sequence
  (with-open [rdr (io/reader  (io/resource "day01.data"))]
    (mapv
     read-string
     (line-seq rdr))))

(reduce
 +
 frequency-sequence)

;; part one above
;; ---------------
;; part two below

(defn reduction [{:keys [frequencies-seen current-frequency] :as m} value]
  (let [new-f (+ current-frequency value)
        new-m (assoc m
                     :frequencies-seen (conj frequencies-seen new-f)
                     :current-frequency new-f)]
    (if (frequencies-seen new-f)
      (reduced new-m)
      new-m)))

(:current-frequency
 (reduce
  reduction
  {:frequencies-seen #{}
   :current-frequency 0}
  (apply concat (repeat frequency-sequence))))
