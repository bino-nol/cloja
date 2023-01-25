(ns tasks.task1.task14
  (:use tasks.utils))

(defn filter-start-not-with [char string-coll]
  (filter (fn [string] (if (= (first-char string) char) nil 1)) string-coll))

(defn cart-filtered [coll1 coll2]
  (if (= (count coll2) 0)
    coll1
    (reduce concat `()
            (map (fn [coll1-char]
                   (map (fn [y] (str coll1-char y))
                        (filter-start-not-with coll1-char coll2)))
                 coll1))))

;(defn task14
;  ([coll n] (if (= n 1) coll (task14 coll n (list))))
;  ([coll n res]
;   (if (= n 0)
;     res
;     (recur coll (dec n) (cart-filtered coll res)))))

(defn task14
  ([coll n] (reduce (fn [acc index] (cart-filtered coll acc)) (list) (range n))))

(print (task14 (list "a" "b" "c") 3))
;
;(print (map (fn [elem] (str elem "d")) (list "a" "b" "c")))
;
;(print (filter (fn [elem] (= (first-char elem) "a")) (list "a" "aadsad" "b" "c")))
;
;(print (reduce (fn [elem acc] (+ elem acc)) 10 (list 1 2 3)))