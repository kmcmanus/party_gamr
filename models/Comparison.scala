package models;

sealed trait Comparison;
case class Equals(amount: Amount) extends Comparison;
case class IsGreaterThan(amount: Amount) extends Comparison;
case class IsLessThan(amount: Amount) extends Comparison;
case class Any(comparisons: Seq[Comparison]) extends Comparison;
case class All(comparisons: Seq[Comparison]) extends Comparison;
