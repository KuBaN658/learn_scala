import scala.annotation.tailrec

def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
  @tailrec
  def loop(curNum: Int, fib1: BigInt, fib2: BigInt): BigInt ={
    if (curNum == n) fib1
    else loop(curNum + 1, fib2, fib2 + fib1)
  }
  loop(0, f1, f2)
}
println(fibs(100))

BigInt(10)

val input = List("oleg", "oleg@email.com", "7bdaf0a1be3",
  "a8af118b1a2", "28d74b7a3fe")

val name = "([a-zA-Z]+)".r
val mail = "(\\w+@)(\\w+\\.\\w+)".r
val nameMail = "([a-zA-Z]+) (\\w+@)(\\w+\\.\\w+)".r
val result = input match {
  case List(nameMail(nm, _, domen), _@_*) => f"$nm $domen"
  case List(name(nm), mail(_, domen), _@_*) => f"$nm $domen"
  case _ => "nothing"
}
println(result)
