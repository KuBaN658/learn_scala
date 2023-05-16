case class Logger(num_msg: Int = 0) {

  def info: Logger = {
    println("INFO New Message")
    Logger(num_msg + 1)
  }
  def info(num: Int): Logger = {
    (0 until num).foreach(x => println("INFO New Message"))
    Logger(num_msg + num)
  }

  def print: Unit = println(num_msg)
}

val logger = new Logger

logger.info.print
logger.info.info.info.print
logger.info.info.info.print