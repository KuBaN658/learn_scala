final case class Pair[T, S](first: T, second: S) {
  def swap: Pair[S, T] = {
    Pair(second, first)
  }
}


case class Pair2[T <: Ordered[T]](first: T, second: T) {
  def smaller =
    if (first < second) first
    else second
}



val p = Pair2(BigInt("1000000000000000"),BigInt("7000000000000000"))
require(p.smaller == BigInt("1000000000000000"))
