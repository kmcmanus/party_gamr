package models

/* An individual card */
case class Card(
  title: String,
  text: String = "",
  suit: String = "",
  rank: Int = 0,
  repsonseCards: Int = 0,
  onPlay: Action = NoOpAction,
  onDraw: Action = NoOpAction,
  onChoose: Action = NoOpAction
)
