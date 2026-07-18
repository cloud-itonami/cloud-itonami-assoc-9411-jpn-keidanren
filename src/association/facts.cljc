(ns association.facts
  "Industry rule/history catalog for Keidanren (Japan Business
  Federation / 日本経済団体連合会) -- a 78th industry-association-level
  source (see cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko,
  -9411-irl-ibec, -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii,
  -9411-zaf-busa, -9411-bra-cni, -9411-ken-kam, -9411-can-chamber,
  -9411-mex-coparmex, -9411-ita-confindustria, -9411-nld-vnoncw,
  -9411-kor-kcci, -9411-arg-uia, -9411-bel-feb, -9411-dnk-di,
  -9411-swe-sn, -9411-fin-ek, -9411-tha-fti, -9411-chl-sofofa,
  -9411-col-andi, -9411-cri-uccaep, -9411-ecu-cip, -9411-egy-fei,
  -9411-pry-uip, -9411-ury-ciu, -9411-pol-lewiatan, -9411-prt-cip,
  -9411-pan-conep, -9411-gtm-cacif, -9411-hnd-cohep, -9411-deu-bdi,
  -9411-fra-medef, -9411-gbr-cbi for the first thirty-five) per
  ADR-2607141700 (cloud-itonami-compliance-fact-federation). The
  THIRTY-SIXTH entry aligned to ISIC 9411 (activities of business,
  employers, and professional membership organizations). The FOURTH
  entry in the 16-country major-economy campaign opened at tick 173
  (ARE/AUS/CHE/ESP/IDN/JPN/MYS/NGA/NOR/PHL/TUR/USA/VNM, after DEU/
  FRA/GBR closed). Japan now has real, individually verified facts
  across ALL THREE axes (country: cloud-itonami-iso3166-jpn
  statute.facts, pre-existing; municipality: pre-existing; association:
  this entry -- Japan already had SEVERAL niche financial-sector
  associations from earlier Wave-0 work, e.g.
  cloud-itonami-assoc-6419-jpn-zenginkyo for banking,
  cloud-itonami-assoc-6511-jpn-seiho for life insurance,
  cloud-itonami-assoc-6512-jpn-sonpo for non-life insurance,
  cloud-itonami-assoc-6612-jpn-jsda for securities,
  cloud-itonami-assoc-6810-jpn-recaj for real estate,
  cloud-itonami-assoc-6910-jpn-nichibenren for legal, and
  cloud-itonami-assoc-6920-jpn-jicpa for accounting -- but lacked a
  general cross-industry business/employers confederation entry until
  now).

  Both dates directly confirmed. keidanren.or.jp's own official
  '/en/profile/pro001.html' page states verbatim 'Japan Federation of
  Economic Organizations (Keidanren) was established in August 1946,
  immediately after the end of World War II' and, in its overview
  section, gives day-level precision: 'Established: August 16, 1946'.
  The same official page also confirms the 2002 merger with Nikkeiren
  ('In 2002, Keidanren and Nikkeiren merged to form the Japan Business
  Federation') at year-only precision on the page itself, independently
  corroborated and refined by en.wikipedia.org, which adds month
  precision: 'founded in May 2002 by amalgamation of Keidanren...and
  Nikkeiren...with Nikkeiren being absorbed into Keidanren'.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"keidanren"
   [{:association-rule/id "keidanren.founding-1946-08-16"
     :association-rule/title "Japan Federation of Economic Organizations (Keidanren) established 16 August 1946, immediately after the end of World War II (keidanren.or.jp's own official page)"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "http://www.keidanren.or.jp/en/profile/pro001.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "1946-08-16"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.nikkeiren-merger-2002-05"
     :association-rule/title "Keidanren and Nikkeiren merged in May 2002 to form today's Japan Business Federation, with Nikkeiren absorbed into Keidanren (keidanren.or.jp's own page, month precision independently corroborated by en.wikipedia.org)"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://en.wikipedia.org/wiki/Japan_Business_Federation"
     :association-rule/url-provenance :official-plus-wikipedia-corroborated
     :association-rule/established-date "2002-05"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-jpn-keidanren Wave 0 (ADR-2607141700): "
                 (count (get catalog "keidanren")) " Keidanren entries seeded "
                 "with keidanren.or.jp official page + en.wikipedia.org corroboration. "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
