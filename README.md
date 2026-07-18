# cloud-itonami-assoc-9411-jpn-keidanren

Industry rule/history catalog for **Keidanren** (Japan Business
Federation / 日本経済団体連合会) — the THIRTY-SIXTH entry aligned to **ISIC
9411** (activities of business, employers, and professional
membership organizations), alongside
[`-9411-gbr-cbi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-gbr-cbi)
(United Kingdom),
[`-9411-deu-bdi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-deu-bdi)
(Germany), and 33 other national industry/employers associations.
Part of the [`cloud-itonami`](https://github.com/cloud-itonami)
compliance-fact family (ADR-2607141700,
`cloud-itonami-compliance-fact-federation`, in `com-junkawasaki/root`).

The **fourth** entry in the 16-country major-economy campaign opened
at tick 173. Japan now has real, individually verified facts across
**all three axes** — Japan already had several niche financial-sector
association entries (banking, insurance, securities, real estate,
legal, accounting) from earlier Wave-0 work, but lacked a general
cross-industry business/employers confederation entry until now.

## Sourcing note

Both dates directly confirmed. `keidanren.or.jp`'s own official
`/en/profile/pro001.html` page gives day-level precision for the
founding: "Established: August 16, 1946". The same page confirms the
2002 merger with Nikkeiren at year-only precision, independently
corroborated and refined by `en.wikipedia.org`, which adds month
precision (May 2002).

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on Keidanren's
behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention).
