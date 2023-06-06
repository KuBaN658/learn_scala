package lectures

object RaceCondition extends App {
  var idCount = 0

  def getNewId(): Int = this.synchronized {
    val userId = idCount + 1
    idCount = userId
    userId
  }

  def registerUsers(userCnt: Int, threadName: String): Unit = {

    val userIds = for (_ <- 0 to userCnt) yield getNewId()
    println(s"Users [ $userIds ] has been registerd by $threadName")
  }

  val thread1 = new Thread(() => registerUsers(5, "thread-1"))
  val thread2 = new Thread(() => registerUsers(5, "thread-2"))

  thread1.start()
  thread2.start()
}
