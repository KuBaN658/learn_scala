import lectures.week2oop.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit =
    for arg <- args do
      println(arg + ": " + calculate(arg))
}
