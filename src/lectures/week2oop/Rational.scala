package lectures.week2oop

import scala.annotation.{tailrec, targetName}

object Rational extends App {
  extension (x: Int)
    def + (y: Rational) = Rational(x) + y
    def - (y: Rational) = Rational(x) - y
    def * (y: Rational) = Rational(x) * y
    def / (y: Rational) = Rational(x) / y

  val oneHalf = Rational(1, 2)
  val twoThirds = Rational(2, 3)

  println(oneHalf + twoThirds)
  println(oneHalf * twoThirds)
  println(Rational(3))
  println(Rational(2, 6))
  println(1 + Rational(21, 49))
}

class Rational(n: Int, d: Int):
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // вспомогательный конструктор

  override def toString = f"$numer/$denom"

  def + (that: Rational): Rational =
    Rational(that.denom * numer + that.numer * denom, denom * that.denom)

  def + (num: Int): Rational =
    Rational(this.numer + this.denom * num, denom)

  def - (that: Rational): Rational =
    Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)

  def - (num: Int): Rational =
    Rational(this.numer - this.denom * num, this.denom)

  def * (that: Rational): Rational =
    Rational(this.numer * that.numer, this.denom * that.denom)

  def * (num: Int): Rational =
    Rational(this.numer * num, this.denom)

  def / (that: Rational): Rational =
    Rational(this.numer * that.denom, this.denom * that.numer)

  def / (num: Int): Rational =
    Rational(this.numer, this.denom * num)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if this.lessThan(that) then that else this

  @tailrec
  private def gcd(a: Int, b: Int): Int = if b == 0 then a else gcd(b, a % b)
