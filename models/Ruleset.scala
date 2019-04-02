package models

/** How a game is played */
case class Ruleset(
  name: String,
  description: String,
  minPlayers: Int,
  maxPlayers: Option[Int],
  round: Action,
  onPlay: Action,
  onDraw: Action,
  onChoose: Action,
  scoreToWin: Amount,
  deckNames: Seq[String]
);

