package lectures.week1basics

object tupleClass extends App {
  // создание кортежа
  val pair: Tuple2[Int, String] = (99, "Luftballons")

  println(pair(0))
  println(pair(1))
}
