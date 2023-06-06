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


