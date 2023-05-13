package lectures.week2oop.lectures.week2oop

object methods extends App {
  object Padding:
    def padLines(text: String, minWidth: Int): String =
      def padLine(line: String): String =
        if line.length >= minWidth then line
        else "-" * (minWidth - line.length) + line

      val paddedLines =
        for line <- text.linesIterator yield
          padLine(line)

      paddedLines.mkString("\n")

  val text = "aoivn[\n" +
             "aoipaujvnpaou\n" +
             "vn[aidjv[-a-irjv[a\n" +
             "qodivj[ai0redj"
  val pad = Padding.padLines
  println(pad(text, 22))

  def sum(a: Int, b: Int, c: Int): Int = a + b + c
  println(sum(1, 2, 3))

  val a = sum(_, _, _)
  // тоже что  // val a = sum
  println(a(1, 2, 3))

  val b = sum(1, _, 3)
  println(b(2))
  println(b(5))

  var more = 1
  val addMore = (x: Int) => x + more
  println(addMore(10))
  more = 10
  println(addMore(10))

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var sum = 0
  someNumbers.foreach(sum += _)
  println(sum)

  def makeIncreaser(more: Int) = (x: Int) => x + more

  val inc1 = makeIncreaser(1)
  val inc9999 = makeIncreaser(9999)
  println(inc1(1))
  println(inc9999(1))

  def echo(args: String*): Unit =
    for arg <- args do
      println(arg)

  println(echo("Hello", "World"))

  val seq = Seq("What's", "up", "doc?")
  println(echo(seq*))


  trait Increaser:
    def increase(i: Int): Int

  def increaseOne(increaser: Increaser): Int = increaser.increase(1)

  increaseOne(
    new Increaser:
                def increase(i: Int): Int = i + 7
    )

}
