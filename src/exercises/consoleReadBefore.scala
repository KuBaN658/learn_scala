package exercises
import scala.io.StdIn.readLine

object consoleReadBefore extends App {
  def readData(): Vector[Int] = {
    @scala.annotation.tailrec
    def loop(num: String = readLine(), acc: Vector[Int] = Vector()): Vector[Int] = {
      if (num == "END") acc
      else loop(readLine(), acc :+ num.toInt)
    }
    loop()
  }
  val data = readData()
  val res = for {i <- data.indices
                 if i % 2 != 0
                 } yield data(i) * 2

  println(res.sum)
}
