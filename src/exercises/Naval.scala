package exercises

import sun.security.util.Length

object Naval extends App{

  type Point = (Int, Int)
  type Ship = List[Point]
  type Fleet = Map[String, Ship]
  type Field = Vector[Vector[Boolean]]
  type Game = (Field, Fleet)


  import Naval.{Point, Field, Ship, Fleet, Game}
  import scala.io.StdIn


  val amount = StdIn.readInt()
  val field = Vector.fill(10)(Vector.fill(10)(false))
  val fleet: Fleet = Map()
  val game = (field, fleet)
  val data: List[(String, Ship)] = (for (_ <- 1 to amount) yield {
    val shp = StdIn.readLine().split(" ")
    val strShip: (String, Int) = (shp(0), shp(1).toInt)
    val pointShip: List[Point] = (for (_ <- 1 to strShip._2) yield {
      val coords = StdIn.readLine().split(" ").map(_.toInt)
      (coords(0), coords(1))
    }).toList
    (strShip._1, pointShip)
  }).toList

  head(data, game)._2.foreach(x => println(x._1))

  def head(dat: List[(String, Ship)], game: Game): Game = {
    def loop(list: List[(String, Ship)], acc: Game): Game = {
      if (list.isEmpty) acc
      else loop(list.tail, tryAddShip(acc, list.head._1, list.head._2))
    }
    loop(dat, game)
  }

  def readNameShip(): Tuple2[String, Int] = {
    val data: Array[String] = StdIn.readLine().split(' ')
    (data(0), data(1).toInt)
  }
  def readCoordShip(lengthShip: Int): Ship = {
    def loop(length: Int, acc: List[(Int, Int)]): Ship =
    {
      if (length == 0) acc
      else
      {
        val strCoords = StdIn.readLine().split(' ').map(_.toInt)
        val coords = Tuple2(strCoords(0), strCoords(1))
        loop(length - 1, acc :+ coords)
      }
    }
    loop(lengthShip, List())
  }

  def validateShip(ship: Ship): Boolean = {
    if (ship.map(x => x._1).distinct.size == 1 ||
      ship.map(x => x._2).distinct.size == 1 &&
        ship.size < 5 && ship.nonEmpty) true
    else false
  } // определить, подходит ли корабль по своим характеристикам

  def validatePosition(ship: Ship, field: Field): Boolean = {
    ship.map(x => field.slice(x._1 - 1, x._1 + 2)
      .map(y => y.slice(x._2 - 1, x._2 + 2))).flatten.flatten.forall(_ == false)
  } // определить, можно ли его поставить

  def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = {
    // добавить корабль во флот
    fleet + (name -> ship)
  }

  def markUsedCells(field: Field, ship: Ship): Field =  {
    def loop(ship: Ship, acc: Field): Field = {
      if (ship.isEmpty) acc
      else loop(ship.tail, acc.updated(ship.head._1, acc(ship.head._1).updated(ship.head._2, true)))
    }
    loop(ship, field)
  }

  def tryAddShip(game: Game, name: String, ship: Ship): Game = {
    if (validateShip(ship) && validatePosition(ship, game._1)) {
      (markUsedCells(game._1, ship), enrichFleet(game._2, name, ship))
    } else {
      game
    }
  } // логика вызовов методов выше
}
