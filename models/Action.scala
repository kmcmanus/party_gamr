package models

/** A Change to the global state of the game */
sealed trait Action
/** A sequence of actions that happen in order
 *  @param actions The actions
 */
case class MultiAction(
  actions: Seq[Action]
) extends Action
/** An action that changes the state of one or many targets
 *  @param target Who is impacted
 *  @param effect How they are impacted
 */
case class TargetedAction(
  target: Target,
  effect: Effect
) extends Action
/** An action that, depending on a circumstance, causes one of two other actions to occur
 *  @param target The target whose game state we are checking
 *  @param circumstance The way in which we are checking the game state
 *  @param whenTrue The action to take if the game state is as we expect
 *  @param whenFalse The action to take if the game state is not as we expect
 */
case class ConditionAction(
  target: Target,
  circumstance: Circumstance,
  whenTrue: Action,
  whenFalse: Action
) extends Action
/** An action that shuffles all or one deck
 *  @param deck The deck to shuffle, if not all
 */
case class ShuffleDeckAction(
  deck: Option[String]
) extends Action
/** An action that places on the top of all or one deck the contents of the discard pile
 *  @param deck The deck to refill, if not all
 */
case class RefillFromDiscard(
  deck: Option[String]
) extends Action
/** An action that takes all cards on the playing field of all or one deck and discards them
 *  @param deck The deck whose cards to clear, if not all
 */
case class ClearCardsAction(
  deck: Option[String]
) extends Action
/** An action that takes an amount of cards from the top of a deck and discards them
 *  @param number An amount of cards to burn
 *  @param deck The deck whose cards are to be burnt
 */
case class BurnCardsAction(
  number: Amount,
  deck: String
) extends Action
case object ShuffleTurnOrder extends Action
/** An action that does nothing */
case object NoOpAction extends Action

