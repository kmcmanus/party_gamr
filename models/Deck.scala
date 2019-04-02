package models

/* A collection of cards that might be used with multiple rulesets */
case class Deck(
  name: String,
  cards: Seq[Card],
  onPlay: Action,
  onDraw: Action,
  onChoose: Action,
  onLastCardDrawn: Action,
  onCannotDraw: Action
);
