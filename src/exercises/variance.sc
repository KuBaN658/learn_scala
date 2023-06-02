class A (val value: String)

case class B (override val value: String) extends A("It is a A.value") {

}

class FunctionPrint[T <: A](prefix: String) {
  def apply(t: T): Unit = println(prefix + " " + t.value)
}

object FunctionPrint {
  def apply[T <: A](prefix: String) = new FunctionPrint[T](prefix)
}

def methodPrint[T <: A](f: FunctionPrint[T], obj: T): Unit = {
  f(obj)
}

val printA = new FunctionPrint[A]("A-value:")
val printB = new FunctionPrint[B]("B-value:")

val objB = new B("It is a B.value")
val objA = new A("It is a A.value")

methodPrint(printA, objA)



class Person (val name: String)

class Student(name: String, val course: Int) extends Person(name)

class Pair[+Student](val first: Student, val second: Student) {
  def replaceFirst[T >: Student](newValue: T): Pair[T] = {
    new Pair(newValue, second)
  }
}

def printNames(pair: Pair[Person]): Unit = {
  println("1: " + pair.first.name + "  2: " + pair.second.name)
}

val pair = new Pair(new Student("Pavel", 1), new Student("Oleg", 5))
printNames(pair.replaceFirst(new Person("Oliver")))


