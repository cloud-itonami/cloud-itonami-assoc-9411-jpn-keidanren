(ns association.facts-test
  (:require [kotoba.lang.text :as str]
            [clojure.test :refer [deftest is testing]]
            [association.facts :as facts]))

(def ^:private entries (facts/spec-basis "keidanren"))

(deftest keidanren-has-spec-basis
  (is (= 26 (count entries)))
  (is (every? #(str/starts-with? (:association-rule/url %) "https://") entries)
      "http:// is not a citation of the same page; it is a citation of a redirect")
  (is (every? #(= "9411" (:association-rule/isic %)) entries))
  (is (every? #(= "JPN" (:association-rule/country %)) entries)))

(deftest every-entry-is-individually-identified-and-cited
  ;; A catalog whose ids collide silently loses an entry the moment anything
  ;; indexes it by id; a catalog that reuses one url for everything is one
  ;; citation wearing twenty-six hats.
  (is (= (count entries) (count (distinct (map :association-rule/id entries)))))
  (is (every? #(str/starts-with? (:association-rule/id %) "keidanren.") entries))
  (is (every? :association-rule/retrieved-at entries))
  (is (every? :association-rule/title entries))
  (is (every? #(seq (:association-rule/topic %)) entries))
  (is (< 1 (count (distinct (map :association-rule/url entries))))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "doyukai")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["keidanren" "doyukai"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["doyukai"] (:missing-associations c)))))

(deftest the-note-counts-what-the-catalog-actually-holds
  ;; The note is computed, so it moves when the catalog does. Asserting the
  ;; numbers rather than the sentence keeps this from being a spellcheck --
  ;; and asserting ALL THREE tiers is what makes it discriminating: two of the
  ;; three provenances also begin with `official-`, so a tier test written in
  ;; the wrong order reports 26 / 0 / 0 and still reads like a clean catalog.
  (let [note (facts/note-for "keidanren")]
    (is (str/includes? note "26 Keidanren entries"))
    (is (str/includes? note "24 from Keidanren's own Japanese publication"))
    (is (str/includes? note "1 with precision Wikipedia supplies and Keidanren does not"))
    (is (str/includes? note "1 superseded by another page of Keidanren's own site"))))

(deftest the-merger-month-is-not-attributed-to-keidanren
  ;; Keidanren's own chronology gives the year and no month. Recording only the
  ;; Wikipedia month would put a precision on Keidanren that Keidanren does not
  ;; claim, and nothing downstream could tell. Both are kept, separately cited.
  (let [by-id (into {} (map (juxt :association-rule/id identity) entries))
        official (by-id "keidanren.nikkeiren-merger-2002-official-year-only")
        wiki     (by-id "keidanren.nikkeiren-merger-2002-05")]
    (is (= "2002" (:association-rule/established-date official)))
    (is (= "2002-05" (:association-rule/established-date wiki)))
    (is (= :official-keidanren-or-jp (:association-rule/url-provenance official)))
    (is (= :official-plus-wikipedia-corroborated (:association-rule/url-provenance wiki)))
    (is (not= (:association-rule/url official) (:association-rule/url wiki))
        "the split is only visible if the two claims are cited separately")))

(deftest the-english-charter-is-kept-as-superseded-not-as-official
  ;; Keidanren's English Charter page carries the 5th revision of 2017 while its
  ;; Japanese page carries the 6th of 2024. Filing the English page as a clean
  ;; official citation would let a reader take the superseded principle 2 as
  ;; current, which is the whole reason the entry is here.
  (let [by-id (into {} (map (juxt :association-rule/id identity) entries))
        en (by-id "keidanren.charter-en-5th-revision-superseded")
        ja (by-id "keidanren.charter-6th-revision-2024-05-31")]
    (is (= "2017-11-08" (:association-rule/last-revised-date en)))
    (is (= "2024-05-31" (:association-rule/last-revised-date ja)))
    (is (= :official-keidanren-or-jp-en-superseded (:association-rule/url-provenance en)))
    (is (= :official-keidanren-or-jp (:association-rule/url-provenance ja)))
    (is (not= (:association-rule/url en) (:association-rule/url ja)))
    (is (str/includes? (:association-rule/url en) "/en/")
        "the superseded text is the English one; a tier that pointed at the Japanese page would be a different claim")))

(deftest the-statutes-chain-is-recorded-article-by-article
  ;; The point of the catalog is the chain -- the power to issue norms, the
  ;; admission gate, and the sanction -- not the founding date. If these three
  ;; ever collapse into one entry the chain stops being queryable.
  (let [ids (set (map :association-rule/id entries))]
    (doseq [id ["keidanren.teikan-art-4-4-norms-for-members"
                "keidanren.teikan-art-8-admission"
                "keidanren.teikan-art-11-expulsion"
                "keidanren.teikan-art-12-loss-of-membership"]]
      (is (contains? ids id) id)))
  (is (= 1 (count (filter #(= :sanction (:association-rule/kind %)) entries)))))

(deftest by-topic-filters
  (doseq [[topic n] {:governance 14 :ethics 14 :competition 5 :membership 5
                     :enforcement 3 :disclosure 1 :human-rights 1}]
    (testing (name topic)
      (is (= n (count (facts/by-topic "keidanren" topic))))))
  (is (empty? (facts/by-topic "keidanren" :no-such-topic)))
  (is (empty? (facts/by-topic "doyukai" :governance))))
