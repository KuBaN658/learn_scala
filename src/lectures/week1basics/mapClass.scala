package lectures.week1basics
import scala.collection.mutable


object mapClass extends App {
  // создание неизменяемого словаря по умолчанию
  val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
  println(romanNumeral(2))

  // создание изменяемого словаря
  val treasureMap = mutable.Map.empty[Int, String]

  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Found big X on ground.")
  treasureMap += (3 -> "Dig.")

  println(treasureMap)
  println(treasureMap(2))
}
