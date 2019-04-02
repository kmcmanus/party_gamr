package models

/* A collection of cards that might be used with multiple rulesets */
case class Deck(
  name: String,
  cards: Seq[Card],
  onPlay: Action=NoOpAction,
  onDraw: Action=NoOpAction,
  onChoose: Action=NoOpAction,
  onLastCardDrawn: Action=NoOpAction,
  onCannotDraw: Action=NoOpAction
)
