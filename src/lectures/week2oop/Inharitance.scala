package lectures.week2oop

object Inharitance extends App{
  val student = new Studnt("Aleks", 34, 1, "male")
  println(student.greet)
}

class Prsn(name: String, age: Int) {
  val gender = "n/a"
  def this() = this("UnknownPerson", 999)
  def greet: String = "Hello"
}
// переопределение в конструкторе
class Studnt(name: String, age: Int, id: Int,
            override val gender: String) extends Prsn {
  //
  override def greet: String = s"${super.greet}, $name"


  abstract class BaseDataSource(dataSourceName: String):

    def save: String = s"Save method implemented"

    def delete: String = s"Delete method implemented"

    val user: String

    def connect: String

  class PublicDataSource(ds: String) extends BaseDataSource(ds):
    val user = "publisher"

    override def connect: String =
      s"Public Data Source, no password needed"


  trait PublicConn:
    def showNotification: String

  trait PrivateConn
    def checkCredentials: Boolean = false

  class SomeDataSource(ds: String) extends PublicConn with PrivateConn:
    def showNotification: String = "notification"
    def checkCredentials: Boolean = false



}