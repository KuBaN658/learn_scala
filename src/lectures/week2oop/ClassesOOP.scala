package lectures.week2oop

object ClassesOOP extends App {
  val student = new Student(1, "Bob")
  println(student.getId("Alice", 2))
  println(student.getId)
  val student2 = new Student()
  println(student2.getId)
}

class Student(id: Int, name: String) {
  def this(name: String) = this(0, name)
  def this() = this(0, "NoName")
  def getId(names: String, ids: Int): String =
    s"${this.name} has ID ${this.id} and $names has ID $ids"

  def getId: String = s"here is ${this.name}'s ID ${this.id}"

}

