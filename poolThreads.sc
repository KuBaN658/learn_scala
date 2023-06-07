import java.util.concurrent.Executors

val runnable = new Runnable {
  override def run(): Unit = println("I run in parallel")
}

val pool = Executors.newFixedThreadPool(2)

pool.execute(runnable)

println(pool.isShutdown)

pool.shutdown()

println(pool.isShutdown)
