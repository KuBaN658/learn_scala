package lectures.week2oop.lectures.week2oop

object errorsExeptions extends App {
  def intOrNothing(hasException: Boolean): Int =
    if (hasException) throw new RuntimeException("Exception is here")
    else 200

  try {
    intOrNothing(false)
  } catch {
    case e: RuntimeException => println("RTE is here")
  } finally { // должен содержать только побочные действия
    println("I will be there no matter what")
  }

  // свое собственное исключение
  class MyException extends Exception

  val exception = new MyException
  // throw exception

//  val exceptionval: Int = throw new NullPointerException
//  val exceptionVal: String = throw new NullPointerException // тип Nothing

  val potentialException = try {
    intOrNothing(false)
  } catch {
    case e: RuntimeException => println("RTE is here")
  } finally {
    println("I will be there no matter what")
  }
  println(Int.MaxValue + Int.MaxValue + 2)
  println(0.1d+ 0.2d)
}
