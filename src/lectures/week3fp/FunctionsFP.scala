package lectures.week3fp

object FunctionsFP extends App {
  trait Multiplication[A, B] {
    def apply(x: A): B
  }

  val res = new Multiplication[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  println(res(2))

  val res2 = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 * 3
  }

  println(res2(2))

  val res3 = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 * v2
  }

  println(res3(5, 4))

  val product = (x: Int, y: Int) => x * y

  val product2: (Int, Int) => Int = (x, y) => x * y

  val product3: (Int, Int) => Int = _ * _

  val res4 = (x: Int) => x * 2

  val res5: Int => Int = x => x * 2

  val res6 = { (x: Int) =>
    x * 2
  }
  val res7: Int => Int = _ * 2

  val strlen: String => Int = (str: String) => str.length

  import scala.annotation.tailrec


  @tailrec
  def nTimes(f: Int => Int, x: Int, n: Int): Int = {
    if (n <= 0) x
    else nTimes(f, f(x), n - 1)
  }

  val increment: Int => Int = _ + 1

  println(nTimes(increment, 0, 3))

  def curryingNTimes(f: Int => Int, n: Int): Int => Int = {
    if (n <= 0) (x: Int) => x // лямбда-функция, что просто берет и возвращает значение
    else (x: Int) => curryingNTimes(f, n - 1)(f(x))
  }

  println(curryingNTimes(increment, 3)(0))


  def someFunc: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val func = someFunc(1)
  println(func)
}
