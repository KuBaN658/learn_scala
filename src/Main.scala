import scala.util.matching.Regex

@main
def main(): Unit = {
  val name = io.StdIn.readLine()
  val pattern: Regex = "[A-Z][a-z]+ [A-Z][a-z]+".r

  def func(name: String): Unit = {
    pattern.findFirstMatchIn(name) match {
      case Some(_) => {
        val arr_data = name.split(' ')
        println(f"${arr_data(0)(0)}. ${arr_data(1)(0)}.")
      }
      case None => println("Oops, something is wrong")
    }
  }

  func(name)

}