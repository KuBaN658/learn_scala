//val ints = List(1, 2, 3, 4, 5)
//
//for i <- ints do println(i)
//
//for i <- ints if i > 2 do println(i)
//
//for
//  i <- 1 to 3
//  j <- 'a' to 'c'
//  if i == 2
//  if j == 'b'
//do println(s"i = $i, j = $j")
//
//
//val doubles = for i <- ints yield i * 2
//
//val names = List("chris", "ed", "maurice")
//val capNames = for name <- names yield name.capitalize
//
//val fruits = List("apple", "banana", "lime", "orange")
//val fruitLengths = for
//  f <- fruits
//  if f.length > 4
//yield f.length
//
//for
//  i <- 1 to 2
//  j <- 'a' to 'b'
//  k <- 1 to 10 by 5
//do
//  println(s"i = $i, j = $j, k = $k")
//
//
//  // scala 2
//  for {
//    i <- 1 to 2
//    j <- 'a' to 'b'
//    k <- 1 to 10 by 5
//  } {
//    println(s"i = $i, j = $j, k = $k")
//  }
//
//  // scala 2
//  for {
//    i <- 1 to 5
//    if i % 2 == 0
//  } {
//    println(i)
//  }
//
//// scala 2
//for {
//  i <- 1 to 10
//  if i > 3
//  if i < 6
//  if i % 2 == 0
//} {
//  println(i)
//}

//val states = Map("AK" -> "Alaska",
//                 "AL" -> "Alabama",
//                 "AR" -> "Arizona")

//for (abbrev, fullName) <- states do
//  println(s"$abbrev: $fullName")

//// scala 2
//for ((abbrev, fullName) <- states)
//  println(s"$abbrev: $fullName")

//scala 2
//val list =
//  for (i <- 10 to 12)
//    yield i * 2

//блок кода после yield
val names = List("_olivia", "_walter", "_peter")

val capNames = for name <- names yield
  val nameWithoutUnderscore = name.drop(1)
  val capName = nameWithoutUnderscore.capitalize
  capName

  // scala 2

  val names = List("_olivia", "_walter", "_peter")

  val capNames = for (name <- names) yield {
    val nameWithoutUnderscore = name.drop(1)
    val capName = nameWithoutUnderscore.capitalize
    capName
  }

  // for тело метода
  def between3and10(xs: List[Int]): List[Int] =
    for
      x <- xs
      if x >= 3
      if x <= 10
    yield x