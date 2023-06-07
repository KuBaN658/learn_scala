import java.util.concurrent.atomic._

val id = new AtomicLong(0L)
def getId(): Long = id.incrementAndGet()

def registerUsers(userCnt: Int, threadName: String): Unit = {
  val userIds = for (_ <- 0 to userCnt) yield getId()
  println(s"Users [ $userIds ] has been registerd by $threadName")
}

val thread1 = new Thread(() => registerUsers(5, "thread-1"))
val thread2 = new Thread(() => registerUsers(5, "thread-2"))

thread1.start()
thread2.start()