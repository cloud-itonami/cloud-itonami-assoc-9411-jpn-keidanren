(ns association.facts
  "Industry rule/history catalog for Keidanren (Japan Business Federation /
  Nippon Keizai-dantai Rengokai) per ADR-2607141700 (cloud-itonami-
  compliance-fact-federation), aligned to ISIC 9411 (activities of business,
  employers, and professional membership organizations). Japan has real,
  individually verified facts across all three axes -- country:
  cloud-itonami-iso3166-jpn statute.facts; municipality: pre-existing;
  association: this entry, the general cross-industry confederation that the
  earlier sector entries (zenginkyo, seiho, sonpo, jsda, recaj, nichibenren,
  jicpa) do not cover.

  WHAT IS ACTUALLY HERE. Keidanren's self-regulation is a chain of documents,
  not a founding date. The Statutes art. 4(4) give the association the standing
  power to draw up norms that serve as guidelines for members; the Charter of
  Corporate Behavior is such a norm, and Keidanren's own profile page describes
  pressing member firms to observe it; the Implementation Guidance works the
  Charter down to concrete actions, and its chapter 2 turns competition-law
  compliance on trade associations themselves; the Statutes arts. 11 and 12
  supply expulsion and loss of membership. The catalog records that chain.

  WHAT IS DELIBERATELY NOT HERE. The catalog does NOT assert that the Charter
  is enforceable as a rule under art. 11(1). Art. 11(1) speaks of the Statutes
  and other RULES, and Keidanren nowhere says the Charter is one of them; the
  documents are recorded separately so a reader can see the gap rather than
  inherit our guess about it.

  PROVENANCE, by tier -- read `:association-rule/url-provenance`, not the
  title, when you need to know how far a fact has been checked:

  - `:official-keidanren-or-jp` -- Keidanren's own Japanese publication at
    keidanren.or.jp, including the Statutes and Charter PDFs it serves.
    Every url fetched 2026-09-06; `tools/verify_urls.cljs` re-checks them.
  - `:official-plus-wikipedia-corroborated` -- exactly one entry: the MONTH of
    the 2002 Nikkeiren merger. Keidanren's own chronology gives the year and
    no month, so the month is Wikipedia's. The year-only official statement is
    kept as its own entry so that this is visible rather than implied.
  - `:official-keidanren-or-jp-en-superseded` -- Keidanren's own site,
    superseded by Keidanren's own site. Exactly one entry: the English Charter
    page still carries `5th Revision: Nov. 8, 2017` and a principle 2 without
    the supply-chain sentence the 6th revision added, while the Japanese page
    carries the 6th revision of 31 May 2024. Do not 'fix' this by deleting the
    entry -- an English-only reader getting the superseded obligation is the
    fact.

  Personal names are deliberately absent. The officers page names every
  director; `organization.edn` records institutional office titles only, and
  this catalog keeps to the same rule.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"keidanren"
   [{:association-rule/id "keidanren.founding-1946-08-16"
     :association-rule/title "Keidanren gives its own founding date as 16 August 1946, in the overview table of its official profile page"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.keidanren.or.jp/profile/pro001.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "1946-08-16"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.incorporation-permit-1961-06-29"
     :association-rule/title "Permission to incorporate as a shadan hojin (incorporated association) was granted 29 June 1961 — the association existed for fifteen years before it held legal personality"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.keidanren.or.jp/profile/pro001.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "1961-06-29"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.general-incorporated-association-2012-03-30"
     :association-rule/title "Keidanren converted from shadan hojin to ippan shadan hojin (general incorporated association) on 30 March 2012, following Japan's public-interest corporation reform — its chronology page gives this at day precision"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.keidanren.or.jp/profile/enkaku.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "2012-03-30"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.nikkeiren-merger-2002-official-year-only"
     :association-rule/title "Keidanren's own chronology dates the Nikkeiren merger to 2002 with NO month — this entry exists so that the month on the entry below is visibly not Keidanren's claim"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.keidanren.or.jp/profile/enkaku.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "2002"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.nikkeiren-merger-2002-05"
     :association-rule/title "Keidanren and Nikkeiren merged in May 2002 to form today's Japan Business Federation, Nikkeiren being absorbed into Keidanren — month precision comes from en.wikipedia.org, not from Keidanren"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://en.wikipedia.org/wiki/Japan_Business_Federation"
     :association-rule/url-provenance :official-plus-wikipedia-corroborated
     :association-rule/established-date "2002-05"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.membership-composition-2026-04-01"
     :association-rule/title "Membership as of 1 April 2026: 1,580 corporate members, 150 group members, 33 special members, 1,763 total — the three classes are the ones the Statutes arts. 6 and 7 define"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :membership-rule
     :association-rule/url "https://www.keidanren.or.jp/profile/pro001.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:membership}}
    {:association-rule/id "keidanren.teikan-2024-05-31"
     :association-rule/title "Teikan (Articles of Association) as revised 31 May 2024 — 14-page PDF, 12 chapters, 61 articles, published by Keidanren itself"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :constitutive-instrument
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2024-05-31"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.teikan-art-3-purpose"
     :association-rule/title "Statutes art. 3 states the purpose: as a comprehensive economic organisation, to draw out the vitality of firms and of the individuals and localities that support them, and to contribute to autonomous development of the economy and improvement of national life"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :constitutive-instrument
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance}}
    {:association-rule/id "keidanren.teikan-art-4-4-norms-for-members"
     :association-rule/title "Statutes art. 4(4) lists, among the activities the association carries out, the drawing up of plans and norms that serve as guidelines for members — the standing power under which member-facing codes are issued"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :constitutive-instrument
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:governance :ethics}}
    {:association-rule/id "keidanren.teikan-art-8-admission"
     :association-rule/title "Statutes art. 8: admission is by application under a procedure the Board sets, approved by the Chairman under Board rules; each member must register one representative with the Director-General on joining"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :membership-rule
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:membership :governance}}
    {:association-rule/id "keidanren.teikan-art-11-expulsion"
     :association-rule/title "Statutes art. 11: a member may be expelled for breaching the Statutes or other rules, for damaging the association's honour or acting against its purpose, or for other just cause — by at least half of all members holding at least two thirds of the votes, after one week's notice and an opportunity to be heard at the General Meeting"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :sanction
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:enforcement :membership}}
    {:association-rule/id "keidanren.teikan-art-12-loss-of-membership"
     :association-rule/title "Statutes art. 12: membership is lost, apart from expulsion and withdrawal, by failing the dues obligation for two years, by consent of all members, or on the member's bankruptcy or dissolution — dues already paid are not refunded"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :membership-rule
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:membership :enforcement}}
    {:association-rule/id "keidanren.teikan-art-58-electronic-public-notice"
     :association-rule/title "Statutes art. 58: public notices are given by electronic notice, falling back to the Official Gazette only where accident or unavoidable cause prevents it"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :disclosure-rule
     :association-rule/url "https://www.keidanren.or.jp/profile/teikan.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:disclosure :governance}}
    {:association-rule/id "keidanren.profile-urges-charter-compliance"
     :association-rule/title "Keidanren's profile page describes pressing member firms to observe the Charter of Corporate Behavior as part of establishing trust in business — the association's own account of the Charter as an obligation it puts on members"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :governance-program
     :association-rule/url "https://www.keidanren.or.jp/profile/pro001.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :membership}}
    {:association-rule/id "keidanren.charter-established-1991-09-14"
     :association-rule/title "The Charter of Corporate Behavior was established 14 September 1991 — the date carried on the instrument itself"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "1991-09-14"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :governance}}
    {:association-rule/id "keidanren.charter-6th-revision-2024-05-31"
     :association-rule/title "Charter of Corporate Behavior, 6th revision of 31 May 2024 — ten principles binding member firms to comply with law, international rules and their spirit; same date as the Statutes revision"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2024-05-31"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :governance}}
    {:association-rule/id "keidanren.charter-principle-2-fair-business-practices"
     :association-rule/title "Charter principle 2 (fair business practices): fair and free competition, appropriate transactions and responsible procurement; co-existence and co-prosperity across the whole supply chain under the Partnership Building Declaration; and sound relations with politics and government"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :competition}}
    {:association-rule/id "keidanren.charter-principle-10-top-management"
     :association-rule/title "Charter principle 10 puts implementation on top management personally: build effective governance, carry the Charter through the company and its group, press supply-chain behaviour in line with it, and on a breach that loses public trust take the lead in resolution, cause investigation and prevention"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :governance :enforcement}}
    {:association-rule/id "keidanren.charter-preamble-2022-12"
     :association-rule/title "The preamble carried above the Charter is dated December 2022 and argues for sustainable capitalism — it is one revision behind the articles it introduces, which carry May 2024"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2022-12"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics}}
    {:association-rule/id "keidanren.charter-pdf-2022"
     :association-rule/title "The Charter as a published document — 4-page PDF served by Keidanren. It carries NO extractable text layer, so every wording recorded here was read from the HTML page, not from this file"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/charter2022.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics}}
    {:association-rule/id "keidanren.charter-en-5th-revision-superseded"
     :association-rule/title "Keidanren's own ENGLISH Charter page still states 5th Revision: Nov. 8, 2017, and its principle 2 reads only fair and free competition, appropriate transactions, and responsible procurement, also maintain a sound relationship with political bodies and government agencies — the supply-chain sentence added by the 6th revision is absent. Reading only the English page yields the superseded obligation"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :code-of-conduct
     :association-rule/url "https://www.keidanren.or.jp/en/policy/csr/charter2022.html"
     :association-rule/url-provenance :official-keidanren-or-jp-en-superseded
     :association-rule/last-revised-date "2017-11-08"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :competition}}
    {:association-rule/id "keidanren.tebiki-9th-2022-12-13"
     :association-rule/title "Implementation Guidance on the Charter of Corporate Behavior, 9th edition, 13 December 2022 — chapter-by-chapter guidance running to the tenth chapter on top management"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :implementation-guidance
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/tebiki9.html"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2022-12-13"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :governance}}
    {:association-rule/id "keidanren.tebiki-10th-ch2-2024-05-31"
     :association-rule/title "Implementation Guidance 10th edition, chapter 2 extract, revised 31 May 2024 — 20-page PDF. Only chapter 2 was reissued at the 6th revision; the other chapters stand at the 9th edition"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :implementation-guidance
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/tebiki10bassui.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2024-05-31"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :competition}}
    {:association-rule/id "keidanren.tebiki-2-1-competition-law"
     :association-rule/title "Implementation Guidance 2-1 requires competition-law compliance to be driven through the whole corporate group at home and abroad, and turns the duty on trade associations themselves — they must maintain compliance in their own association activity and support their constituent firms in it"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :implementation-guidance
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/tebiki10bassui.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:competition :ethics}}
    {:association-rule/id "keidanren.charter-art2-revision-paper-2024-05-07"
     :association-rule/title "The policy paper announcing the principle-2 revision and the chapter-2 guidance revision is dated 7 May 2024, while both instruments carry 31 May 2024 — recorded as the two dates the documents give, with no claim about which is the adoption"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :implementation-guidance
     :association-rule/url "https://www.keidanren.or.jp/policy/2024/038.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/last-revised-date "2024-05-07"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:ethics :competition}}
    {:association-rule/id "keidanren.human-rights-handbook-2021"
     :association-rule/title "Handbook for Business Management that Respects Human Rights, issued December 2021 alongside the revision of Implementation Guidance chapter 4 — 75-page PDF, which reproduces the Charter at its 5th revision"
     :association-rule/association "keidanren"
     :association-rule/isic "9411"
     :association-rule/country "JPN"
     :association-rule/kind :implementation-guidance
     :association-rule/url "https://www.keidanren.or.jp/policy/cgcb/2021handbook.pdf"
     :association-rule/url-provenance :official-keidanren-or-jp
     :association-rule/established-date "2021-12"
     :association-rule/retrieved-at "2026-09-06"
     :association-rule/topic #{:human-rights :ethics}}]})

(defn spec-basis [association] (get catalog association))

(defn- provenance-tier
  "Which of the tiers in the namespace docstring this entry sits on.

  `superseded` and `corroborated` are tested BEFORE `^official-`, because both
  of those provenances ALSO start with `official-`. Ordering it the other way
  would count a superseded translation, and a fact Keidanren never stated, as
  clean official citations -- which is the one thing the tiers are here to
  prevent."
  [entry]
  (let [p (name (:association-rule/url-provenance entry))]
    (cond (re-find #"superseded$" p)   :superseded
          (re-find #"corroborated$" p) :corroborated
          (re-find #"^official-" p)    :official
          :else :unknown)))

(defn note-for
  "The coverage note, COMPUTED from the catalog rather than written beside it.

  Written notes drift: a hand-written count stays at the number it was written
  with while entries are added around it. Deriving the counts means adding an
  entry changes this string, and the parity test then requires the port to be
  regenerated with it."
  [association]
  (let [entries (get catalog association)
        n       (count entries)
        tally   (frequencies (map provenance-tier entries))
        cnt     #(get tally % 0)]
    (str "cloud-itonami-assoc-9411-jpn-keidanren Wave 0 (ADR-2607141700): "
         n " Keidanren entries -- "
         (cnt :official) " from Keidanren's own Japanese publication, "
         (cnt :corroborated) " with precision Wikipedia supplies and Keidanren does not, "
         (cnt :superseded) " superseded by another page of Keidanren's own site. "
         "Extend `association.facts/catalog`, never fabricate an id/url.")))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (note-for "keidanren")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
