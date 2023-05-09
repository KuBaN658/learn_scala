package lectures.week1basics

object Functions extends App {
  def aPerson(name: String, surname: String): String =
    s"$name $surname"

  println(aPerson("John", "Snow"))

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String =
    s"x = $x and y = $y"

  println(aFunctionWithDefaultParameter(1))


  // вычисления аргумента проводятся до вызова функции 1 раз
  def callByValue(x: Long): Unit =
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")


  // вычисления аргумента производится в теле функции
  def callByName(x: => Long): Unit =
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def aBossFunction(): String =
    def aHelperFunction(): String = "I'm here to help"

    aHelperFunction()


  println(aBossFunction())
}
