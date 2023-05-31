import scala.io.StdIn
import scala.util.matching.Regex

object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] =
    val pattern: Regex = "\\*_\\*(.+)\\*_\\*".r
    arg match {
      case pattern(re) => Some(re)
      case _ => None
    }
}

object Main {
  def main(args: Array[String]) = {
    StdIn.readLine() match {
      case FacedString(str) => println(str)
      case _ => println("Could not recognize string")
    }
  }}

