package exercises

import exercises.Bttn.RoundedButton

object Bttn extends App {

  class Button(val label: String) {
    def this() = this("test")

    def click(): String =
      s"button -$label- has been clicked"
  }


  class RoundedButton(label: String) extends Button(label) {
    def this() = this("test")

    override def click(): String = s"rounded ${super.click()}"
  }

  val btn = RoundedButton("fff").click()
  print(btn)
}