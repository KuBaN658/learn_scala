package exercises

object Naval extends App{

  type Point = (Int, Int)
  type Ship = List[Point]
  type Fleet = Map[String, Ship]
  type Field = Vector[Vector[Boolean]]
  type Game = (Field, Fleet)
  val field = (1 to 10).toVector.map(_ => (1 to 10).toVector.map(_ => false))


  import Naval.{Point, Field, Ship, Fleet, Game}
  import scala.io.StdIn

  val amount = StdIn.readInt()
  val fleet: Fleet = Map(): Map[String, Ship]
  for (i <- 0 until amount) {
    val sh = StdIn.readLine().split(' ')
    val lengthShip = sh(1).toInt
    val ship: List[(Int, Int)] = {
      for (i <- 1 to lengthShip) yield {
        val data: String = StdIn.readLine()
        (data(0).toString.toInt, data(2).toString.toInt)
    }
    }.toList
  }


  def validateShip(ship: Ship): Boolean = {
    if (ship.map(x => x._1).distinct.size == 1 ||
      ship.map(x => x._2).distinct.size == 1 &&
        ship.size < 5 && ship.nonEmpty) true
    else false
  } // определить, подходит ли корабль по своим характеристикам

  def validatePosition(ship: Ship, field: Field): Boolean = {
    ship.map(x => x._1 < 10 && x._2 < 10 && x._1 >= 0 && x._2 >= 0).forall(_ == true)
      //(ship.map(x => field.slice(x._1 - 1, x._1 + 2).map(_.slice(x._2 - 1, x._2 + 2)).forall(_.forall(y => y == false))))
  } // определить, можно ли его поставить

  def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = fleet // добавить корабль во флот

  def markUsedCells(field: Field, ship: Ship): Field = field // пометить клетки, которые занимает добавляемый корабль

  def tryAddShip(game: Game, name: String, ship: Ship): Game = {
    println(name)
    game
  } // логика вызовов методов выше
}
