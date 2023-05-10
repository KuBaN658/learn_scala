package exercises

object ClassesOOP extends App {

    val instructor: Instructor = new Instructor(1, "вася", "пупкин")
    println(instructor.fullName())    // Вася Пупкин

    val course: Course = new Course(2, "Course Name", "1234", instructor)
    println(course.instructor.fullName())    // Вася Пупкин
    println(course.getID)  // 21
    println(course.isTaughtBy(instructor))    // true
    println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин")))    // false

    println(course.copyCourse("4321").releaseYear)    // 4321
  }



class Instructor(val id: Int, name: String, surname: String) {
  def fullName(): String =
    val goodName = name.head.toUpper + name.tail
    val goodSurName = surname.head.toUpper + surname.tail
    s"$goodName $goodSurName"
}

class Course(courseID: Int, title: String,
             val releaseYear: String, val instructor: Instructor) {
  def getID: String =
    courseID.toString + instructor.id.toString

  def isTaughtBy(instructor: Instructor): Boolean =
    instructor.id == this.instructor.id

  def copyCourse(newReleaseYear: String): Course =
    new Course(courseID, title, newReleaseYear, instructor)
}



