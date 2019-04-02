package models
/** A Condition that may or may not be true */
sealed trait Circumstance
case object HadCardChosen extends Circumstance
case object IsWinning extends Circumstance
case object IsLosing extends Circumstance
case class HasMostCards(
  deck: Option[String]
) extends Circumstance
case class HasLeastCards(
  deck: Option[String]
) extends Circumstance
case class HasHighestSuit(
  suit: String,
  deck: Option[String]
) extends Circumstance
case class HasLowestSuit(
  suit: String,
  deck: Option[String]
) extends Circumstance
case class HasMostSuit(
  suit: String,
  deck: Option[String]
) extends Circumstance
case class HasLeastSuit(
  suit: String,
  deck: Option[String]
) extends Circumstance
case object ChoseTurnPlayersCard extends Circumstance
case class DeckHasCardsLeft(
  deck: String,
  number: Comparison
) extends Circumstance
case class All(
  circumstances: Seq[Circumstance]
) extends Circumstance
case class Any(
  circumstances: Seq[Circumstance]
) extends Circumstance

