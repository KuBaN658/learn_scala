class Container {
  private var num: Int = 0

  def isEmpty: Boolean = num == 0

  // производитель
  def set(newVal: Int) = num = newVal

  // потребитель
  def get = {
    val result = num // получили значение num
    num = 0 // вернули начальное значение
    result
  }
}

def execute(): Unit = {
  val container = new Container

  val consumer = new Thread(() => {
    println("[потребитель] ожидает значения...")

    container.synchronized {
      container.wait() // ждет сигнал от notify
    }

    println("[потребитель] значение получено:" + container.get)
  })

  val producer = new Thread(() => {
    println("[производитель] идут вычисления...")
    Thread.sleep(100)
    val value = 123

    container.synchronized {
      container.set(value)
      println("[производитель] значение готово:" + value)
      container.notify()
    }
  })

  consumer.start()
  producer.start()
}