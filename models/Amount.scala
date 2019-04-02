package models

/** An Amount is a dynamically calculated number */
sealed trait Amount

/** The number of players currently playing the game */
case object NumberOfPlayers extends Amount
/** Representation of multiplying two amounts together
 *  @param left The left amount
 *  @param right The right amoutn
 */
case class Multiplied(
  left: Amount,
  right: Amount
) extends Amount
/** Representation of addung two amounts together
 *  @param left The left amount
 *  @param right The right amoutn
 */
case class Added(
  left: Amount,
  right: Amount
) extends Amount
/** A Constant Amount
 *  @param n The numeric amount
 */
case class Constant(
  n: Int
) extends Amount

