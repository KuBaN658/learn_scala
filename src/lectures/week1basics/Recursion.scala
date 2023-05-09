package lectures.week1basics

object Recursion extends App{

  import scala.annotation.tailrec

// хвостовая рекурсия
  def factorialWithTailRecursion(n: Int): Int =
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int =
      if x <= 1 then accumulator
      else loop(x - 1, x * accumulator)

    loop(n)

  println(factorialWithTailRecursion(5))


  def repeatWord(word: String, n: Int): String =
    @tailrec
    def loop(i: Int, acc: String = word): String =
      if i <= 1 then acc
      else loop(i - 1, s"$word\n$acc")

    loop(n)


  println(repeatWord("Ура", 5))


  def powerOfTwo(pow: Int): BigInt =
    @tailrec
    def loop(p: Int, res: BigInt = 2): BigInt =
      if p <= 1 then res
      else loop(p - 1, res * 2)

    loop(pow)

  println(powerOfTwo(1))


  def addyn(x: Int, y: Int, n: Int): Int =
    @tailrec
    def loop(num: Int, add: Int, sum: Int = x, amount: Int): Int =
      if amount <= 0 then sum
      else loop(num, add, sum + add, amount - 1)

    loop(num = x, add = y, amount = n)


  println(addyn(5, 2, 10).toString.length)

  val phrase = "I like    Scala"
  println(phrase.split(" ")
    .toList.filterNot(word => word.isEmpty)
    .reverse.mkString(" "))
}
