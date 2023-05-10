package lectures.week1basics

object ArifmeticOperation extends App {
  def peper() =
    println("peper")
    true

  def salt() =
    println("salt")
    false

  peper() && salt()
  println("-------")
  salt() && peper()
  println("-------")
  salt() & peper()
  println("-------")
  peper() | salt()
  println("-------")
  peper() || salt()


  // поразрядные операции(побитовые)
  println(f"1 & 2 = ${1 & 2}")
  println(f"1 | 2 = ${1 | 2}")
  println(f"1 ^ 3 = ${1 ^ 3}")
  println(f"~1 = ${~1}")

  // методы сдвига
  println(f"-1 >> 31 = ${-1 >> 31}")
  println(f"-1 >>> 31 = ${-1 >>> 31}")
  println(f"1 << 2 = ${1 << 2}")

  // обогащающие операции
  println(0 max 5)
  println(0 min 5)
  println(-2.7.abs)
  println(-2.7.round)
  println(1.5.isInfinity)
  println((1.0 / 0).isInfinity)
  println(4 to 6)
  println("bob".capitalize)
  println("robert" drop 2)

}
