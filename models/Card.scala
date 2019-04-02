package models

/* An individual card */
case class Card(
  title: String,
  text: String,
  suit: String,
  rank: Int,
  repsonseCards: Int,
  onPlay: Action,
  onDraw: Action,
  onChoose: Action
);
