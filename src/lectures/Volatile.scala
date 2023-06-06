package lectures
// не будет работать как надо
object Volatile extends App {
  @volatile var counter = 0

  def increment(num: Int, threadName: String): Unit = {

    for (_ <- 0 until num) yield {
      val newCounter = counter + 1
      counter = newCounter
      counter
    }

    println(s"counter = $counter in $threadName")
  }

  val thread1 = new Thread(() => increment(5, "thread-1"))
  val thread2 = new Thread(() => increment(5, "thread-2"))

  thread1.start()
  thread2.start()

  Thread.sleep(1000)
  println(counter)
}
