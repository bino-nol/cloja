(ns test
  (:require [test :refer :all]
            [lab3 :refer :all]))

(use 'lab3)

(deftest p-filter-test []
   (let [
         seq (take 20 (generate-seq))
         ex-seq (doall (filter even? seq))
         ]
     (is (= ex-seq (p-filter even? 2 10 seq)))
     (is (= ex-seq (p-filter even? 4 5 seq)))
     (is (= ex-seq (p-filter even? 2 5 seq)))
     )
   )

(deftest p-filter-test-2 []
   (let [
         seq (generate-seq)
         ex-seq (take 10 (filter even? seq))
         ]
     (is (= ex-seq (take 10 (p-filter even? 2 10 seq))))
     (is (= ex-seq (take 10 (p-filter even? 4 5 seq))))
     (is (= ex-seq (take 10 (p-filter even? 2 5 seq))))
     )
   )
