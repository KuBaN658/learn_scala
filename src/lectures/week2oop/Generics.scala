package lectures.week2oop

object Generics extends App {
  def countSum[A: Numeric](nums: List[A]): A = nums.sum

  println(countSum(List(1, 2, 3)))
  println(countSum(List(1.3, 2.8, 3.7)))

  def createElement[A](el: A): A =
    el

  val anInt = createElement(2)
  val aString = createElement("some string")
  println(s"anInt = $anInt, aString = $aString")

  case class Vehicle(name: String)
  val aVehicle = createElement(Vehicle("car"))
  println(s"aVehicle = $aVehicle, Vehicle.name = ${aVehicle.name}")


  def randomItem[A](items: List[A]): A = {
    val randomIndex = util.Random.nextInt(items.length)
    items(randomIndex)
  }
  println(randomItem(List("a", "bc", "def")))
  println(randomItem(List(1.5, 2.75, 3.8)))

  // обобщения применяются к классам(class), трейтам(trait),  но никак не к объектам (object)
  class SomeClass[T] {
    def someFunc(aVal: T): Unit = println(s"generic type is used")
  }
}
