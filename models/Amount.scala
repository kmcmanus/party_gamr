package models;

/** An Amount is a dynamically calculated number */
sealed trait Amount

/** The number of players currently playing the game */
case object NumberOfPlayers::Amount;
/** Representation of multiplying two amounts together
 *  @param left The left amount
 *  @param right The right amoutn
 */
case class Multiplied::Amount(
  left: Amount,
  right: Amount
);
/** Representation of addung two amounts together
 *  @param left The left amount
 *  @param right The right amoutn
 */
case class Added::Amount(
  left: Amount,
  right: Amount
);
/** A Constant Amount
 *  @param n The numeric amount
 */
case class Constant::Amount(
  n: Int
);

