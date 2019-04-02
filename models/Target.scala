package models;

/** One or several targets that may undergo an effect */
sealed trait Target
/** The Target is the player whose turn it is */
case object TurnPlayer extends Target;
/** The Target is the player whose action caused this event to take place */
case object ActingPlayer extends Target;
/** The Target is every player who meets a qualification
 *  @param thatMatches An aspect of the player's game state that must be true to apply
 */
case class EveryPlayer(
  thatMatches: Qualification,
) extends Target;
/** The Target is a random number of players that meets a qualification
 *  @param thatMatches An aspect of the player's game state that must be true to apply
 *  @param number The number of players to choose
 */
case class RandomPlayer(
  thatMatches: Qualification,
  number: Comparison
) extends Target;
/** The Target is a number of players that meets a qualification, chosen by another player
 *  @param thatMatches An aspect of the player's game state that must be true to apply
 *  @param number The number of players to choose
 *  @param chooser The player that is choosing
 */
case class ChosenPlayer(
  thatMatches: Qualification,
  number: Comparison,
  chooser: Target
) extends Target;

