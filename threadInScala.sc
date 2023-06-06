// запуск потока
val thread = new Thread(() => println("thread running"))
thread.start()

  // используем класс runnable
  class CustomThread extends Thread {
    override def run(): Unit = {
      println("custom thread running...")
    }
  }

val thread2 = new CustomThread
thread.start()
thread.join()

println("custom thread has completed its execution")

  // join заставляет ожидать завершение выполнение потока
def execute(f: => Unit): Thread = {
  val thread = new Thread {
    override def run() = f
  }

  thread.start()
  thread
}

val someThread = execute {
  Thread.sleep(1000)
  println("someThread running...")
  Thread.sleep(1000)
  println("someThread running...")
}


someThread.join()
println("someThread has completed its execution")

val firstThread = new Thread(() => (1 to 3).foreach(_ => println("1st thread: I run in parallel")))
val secondThread = new Thread(() => (1 to 3).foreach(_ => println("2nd thread: I also run in parallel")))

firstThread.start()
secondThread.start()