case class Jar(name: String, value: Int, price: Double)

val jars: List[Jar] = List(
  Jar("Морской синий 6л", 6, 3000.0),
  Jar("Огненно-красный 12л", 12, 5000.0),
  Jar("Зеленый 1л", 1, 500.0)
)

val discount: PartialFunction[Jar, String] = {
  case Jar(name, volume, price) if 5 <= volume && volume <= 10 => f"$name ${price * 0.05}"
  case Jar(name, volume, price) if 10 < volume => f"$name ${price * 0.1}"
}

jars.collect(discount)

Right(1)


def foo(options: List[Option[Int]]): List[Int] = {
  val flatten: PartialFunction[Option[Int], Int] = {
    case Some(value) => value
  }
  options.collect(flatten)
}