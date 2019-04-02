package models

/** How a game is played */
case class Ruleset(
  name: String,
  description: String,
  minPlayers: Int,
  maxPlayers: Option[Int],
  scoreToWin: Amount,
  deckNames: Seq[String],
  round: Action,
  onPlay: Action=NoOpAction,
  onDraw: Action=NoOpAction,
  onChoose: Action=NoOpAction
)

