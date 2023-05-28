import scala.io.StdIn.{readInt, readLine}
object kStatistics extends App {
  val n = readInt()
  val list: List[Int]= readLine().split(" ").map(_.toInt).toList
}
