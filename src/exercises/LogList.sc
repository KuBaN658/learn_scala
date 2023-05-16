abstract class LogLis {

  val all: String
  def add(msg: String): LogLis
  val head: String
  def isEmpty: Boolean
  val tail: LogLis
  def previous: LogLis
  def last: String
}


case class Log(head: String, tail: LogLis) extends LogLis {

  val last = head
  val all = count_all(this)
  val previous = tail

  def count_all(log: LogLis): String = {
    def loop(lg: LogLis, acc: String = ""): String = {
      if (lg.isEmpty) acc.slice(0, acc.length - 1)
      else loop(lg.tail, acc + lg.head + " ")
    }
    loop(log)
  }

  def isEmpty = false

  def add(msg: String): LogLis = {
    new Log(msg, this)
  }
}


case object Empty extends LogLis {

  val all = ""
  override val head: String = ""
  override def isEmpty = true
  override val tail = null

  override def last = throw new NoSuchElementException

  override def previous: LogLis = throw new NoSuchElementException

  def add(msg: String): LogLis = {
      new Log(msg, Empty)
  }
}


val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
list.add("myMassage")
val emp = Empty
emp.previous
