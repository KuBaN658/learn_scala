package lectures.week2oop

object CaseClasses extends App {
  case class Person(name: String, occupation: String)

  val bob = Person("Bob", "Developer")
  val bobTween = Person("Bob", "Developer")
  val anotherBob = bob.copy("John")
  val alice = Person("Alice", "Engineer")

  println(bob.name)
  println(bob)
  println(bob == bobTween)
  println(anotherBob)
  println(alice)


  case class Course(title: String, instructor: String)

  object Course {
    def apply(instructor: String): Course = Course("AdvancedScala", instructor)
  }

  val scalaCourse = Course("Scala", "Bob")
  val course = Course("Scala", "Bob")
  val course1 = Course("Alice")
  val course2 = scalaCourse.copy()
  val course3 = new Course("scala", "Bob")
  val course4 = scalaCourse.copy("AdvancedScala")
  val course5 = Course("Scala", "Bob")
  // val course = new Course("Scala")
}


