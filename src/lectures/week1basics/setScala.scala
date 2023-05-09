package lectures.week1basics

object setScala extends App {
  // неизменяемое множество по умолчанию
  // scala.collection.immutable.Set
  var jetSet = Set("Boing", "Airbus")
  jetSet += "Lear"
  val query = jetSet.contains("Lear")
  println(query)

  // изменяемое множество
  import scala.collection.mutable

  val movieSet = mutable.Set("Spotlight", "Moonlight")
  movieSet += "Parasite"
  println(movieSet)

  // неизменяемый
}
