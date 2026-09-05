# cloud-itonami-assoc-9411-jpn-keidanren

Industry rule/history catalog for **Keidanren** (Japan Business
Federation / 日本経済団体連合会) — aligned to **ISIC 9411** (activities of
business, employers, and professional membership organizations),
alongside
[`-9411-gbr-cbi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-gbr-cbi)
(United Kingdom),
[`-9411-deu-bdi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-deu-bdi)
(Germany), and other national industry/employers associations.
Part of the [`cloud-itonami`](https://github.com/cloud-itonami)
compliance-fact family (ADR-2607141700,
`cloud-itonami-compliance-fact-federation`, in `com-junkawasaki/root`).

Japan already had several niche financial-sector association entries
(banking, insurance, securities, real estate, legal, accounting) from
earlier Wave-0 work; this is the general cross-industry
business/employers confederation.

## What is actually here

Keidanren's self-regulation is a **chain of documents**, not a founding
date:

| | |
|---|---|
| Statutes art. 4(4) | the standing power to draw up norms serving as guidelines for members |
| Charter of Corporate Behavior | such a norm — established 1991-09-14, 6th revision 2024-05-31, ten principles |
| Implementation Guidance | works the Charter down to actions; chapter 2 turns competition-law compliance on **trade associations themselves** |
| Statutes arts. 11, 12 | expulsion, and loss of membership |

The catalog records that chain. It does **not** assert that the Charter
is enforceable as a "rule" under art. 11(1) — Keidanren nowhere says it
is one, so the documents are recorded separately and the gap is left
visible rather than closed with a guess.

## Sourcing note

Read `:association-rule/url-provenance`, not the title, when you need to
know how far a fact has been checked. Three tiers:

- **`:official-keidanren-or-jp`** — Keidanren's own Japanese
  publication, including the Statutes and Charter PDFs it serves.
- **`:official-plus-wikipedia-corroborated`** — exactly one entry, the
  **month** of the 2002 Nikkeiren merger. Keidanren's own chronology
  gives the year and no month, so the month is Wikipedia's. The
  year-only official statement is kept as its own entry so this is
  visible rather than implied.
- **`:official-keidanren-or-jp-en-superseded`** — exactly one entry.
  Keidanren's **English** Charter page still carries `5th Revision:
  Nov. 8, 2017`, and its principle 2 lacks the supply-chain sentence
  the 6th revision added, while the Japanese page carries the 6th
  revision of 2024-05-31. An English-only reader takes the superseded
  obligation as current. Do not "fix" this by deleting the entry — the
  divergence *is* the fact.

Every cited url was fetched 2026-09-06 and returned 200. Re-check them:

```bash
nbb tools/verify_urls.cljs      # 0 = all 200, 1 = something moved, 2 = refused
```

That checker reads the urls from the data file rather than holding its
own copy, and fetches a control path that must come back 404 — a
checker that cannot tell a missing page from a present one would pass
every citation, including the dead ones, so it refuses instead. It is
deliberately **not** part of `clojure -M:test`: it reaches the public
internet, and a citation that 404s tomorrow is a fact about
keidanren.or.jp, not a defect in this repo's code.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on Keidanren's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one. Personal names are deliberately absent; the officers page
names every director, and this repo records institutional office titles
only.

## Data

- `src/association/facts.cljc` — the catalog as a hand-authored literal.
- `data/datascript-tx.edn` — the same catalog as DataScript tx-data, and
  the **input** to the Kotoba port. Query it alongside other
  `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`.
- `src/association_facts.kotoba` — **generated** by
  `nbb tools/gen_kotoba.cljs` from the data file. Do not edit by hand.
- `schema/association-rule.edn` — DataScript schema.

The `.cljc` and the `.kotoba` are written independently — one by hand,
one from the data file — which is the only reason comparing them means
anything. `test/association_facts_kotoba_parity_test.clj` compares every
field of every entry, both counts, topic membership in the written
order, and every `by-topic` index; the topic order is transcribed into
the test by hand as a third witness to what the data file says.

```bash
clojure -M:test                 # catalog invariants + Kotoba parity
nbb tools/gen_kotoba.cljs       # regenerate the port after editing the data
```

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention).
