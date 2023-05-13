package exercises

object Solution extends App {
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map(_.sum).max
  }

  def fizzBuzz(n: Int): List[String] = {
    Range(1, n + 1).map(number => {
      (number % 3 == 0, number % 5 == 0) match {
        case (true, true) => "FizzBuzz"
        case (true, _) => "Fizz"
        case (_, true) => "Buzz"
        case _ => number.toString
      }
    })
      .toList

  }

  def numberOfSteps(num: Int): Int = {

    def nos(num: Int, count: Int = 0): Int = {
      if (num == 0) count
      else if (num % 2 == 0) nos(num / 2, count + 1)
      else nos(num - 1, count + 1)
    }
    nos(num)
  }
  println(numberOfSteps(8))
}


