package models


/** A change to the world state of a particular Target */
sealed trait Effect
/** The targeted players gain points
 *  @param number The amount of points gained
 */
case class GainPoints(
  number: Amount
) extends Effect
/** The targeted players lose points
 *  @param number The amount of points lost
 */
case class LosePoints(
  number: Amount
) extends Effect
/** The targeted players win */
case object Wins extends Effect
/** The targeted players lose */
case object Loses extends Effect
/** The targeted player is knocked out of the game - the game continues on without them */
case object LeavesGame extends Effect
/** The targeted player is knocked out of the round */
case object LeavesRount extends Effect
/** The targeted player draws some cards
 *  @param number The number of cards to draw
 *  @param deck The deck from which to draw the cards
 */
case class DrawsCards(
  number: Comparison,
  deck: String
) extends Effect
/** The targeted player discards some cards of their choice
 *  @param number The number of cards to discard
 *  @param deck The deck from which the discarded cards must have been drawn from, if that is necessary
 */
case class DiscardsChosenCards(
  number: Comparison,
  deck: Option[String]
) extends Effect
/** The targeted player discards some cards at random
 *  @param number The number of cards to discard
 *  @param deck The deck from which the discarded cards must have been drawn from, if that is necessary
 */
case class DiscardsRandomCards(
  number: Comparison,
  deck: Option[String]
) extends Effect
/** The targeted player plays some cards to the center area
 *  @param number The number of cards to play
 *  @param deck The deck from which the played cards must have been drawn from, if that is necessary
 */
case class PlaysCards(
  number: Comparison,
  deck: Option[String]
) extends Effect
/** The targeted player responds to a played card by the Turn Player with some cards
 *  @param deck The deck from which the played cards must have been drawn from, if that is necessary
 */
case class RespondsCards(
  deck: Option[String]
) extends Effect
/** The targeted player chooses some cards in the play area
 *  @param number The number of cards to choose
 *  @param deck The deck from which the chosen cards must have been drawn from, if that is necessary
 */
case class ChooseCards(
  number: Comparison,
  deck: Option[String]
) extends Effect
case class ChosesNextTurn(
  qualifyingTarget: Target,
  temporaryChange: Boolean
) extends Effect

