package lectures.week2oop.lectures.week2oop

object Sugar extends App {
  class Individ(val name: String, occupation: String) {
    def worksAs(jobName: String): Boolean = jobName == occupation

    def speaksEnglish: Boolean = true

    def &(indiv: Individ): String = s"$name and ${indiv.name} are colleagues"

    def unary_! : String = s"$name is not real"

    def apply(): String = s"$name works as a $occupation"
}
  val bob = Individ("Bob", "Developer")
  val alice = Individ("Alice", "Data Engineer")

  println(bob worksAs "Developer") // если у метода один аргумент
  println(bob & alice)
  println(!bob)
  println(bob())



}
