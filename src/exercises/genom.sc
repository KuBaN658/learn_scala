val points: List[Int] = List(2, 4, 5)
var chr1: List[Char] = "aaaaaaa".toList
var chr2: List[Char] = "ddddddd".toList

val res = for (i <- points) {
  val res = List(chr1, chr2).map(_.splitAt(i)).reduce((x, y) => (x._1 ++ y._2, y._1 ++ x._2))
  chr1 = res._1
  chr2 = res._2
}

println(chr1.mkString(""))
println(chr2.mkString(""))

