(ns association.facts-test
  (:require [clojure.string :as str]
            [clojure.test :refer [deftest is]]
            [association.facts :as facts]))

(deftest keidanren-has-spec-basis
  (let [sb (facts/spec-basis "keidanren")]
    (is (= 2 (count sb)))
    (is (every? #(str/starts-with? (:association-rule/url %) "http") sb))
    (is (every? #(= "9411" (:association-rule/isic %)) sb))
    (is (every? #(= "JPN" (:association-rule/country %)) sb))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "doyukai")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["keidanren" "doyukai"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["doyukai"] (:missing-associations c)))))

(deftest by-topic-filters
  (is (= 2 (count (facts/by-topic "keidanren" :governance))))
  (is (empty? (facts/by-topic "keidanren" :labor)))
  (is (empty? (facts/by-topic "doyukai" :governance))))
