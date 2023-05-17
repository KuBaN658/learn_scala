def heightChecker(heights: Array[Int]): Int = {
  val sortedHeight = heights.sortWith(_ < _)
  val res =
    for (i <- heights.indices)
    yield heights(i) == sortedHeight(i)
  res.count(_ == false)
}