package models;
/** A Qualification that should be applied before resolving the possible Targets */
sealed trait Qualification
case object All extends Qualification;
case object Winning extends Qualification;
case object Losing extends Qualification;
case class BetterThan(
  player: Target
) extends Qualification;
case class WorseThan(
  player: Target
) extends Qualification;
case class NonTurnPlayer(
  thatMatches: Qualification
) extends Qualification;
case class NonActingPlayer(
  thatMatches: Qualification
) extends Qualification;

