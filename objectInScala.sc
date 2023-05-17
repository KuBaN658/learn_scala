object StringUtils:
  def truncate(s: String, length: Int): String = s.take(length)
  def containsWhitespace(s: String): Boolean = s.matches(".*\\s.*")
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty


StringUtils.truncate("Chuck Bartowski", 5)

import StringUtils.*
truncate("Chuck Bartowski", 5)
containsWhitespace("Sarah Walker")
isNullOrEmpty("John Casey")


import StringUtils.{truncate, containsWhitespace}
truncate("Charles Carmichael", 7)
containsWhitespace("Captain Awesome")
isNullOrEmpty("Morgan Grimes")

object MathConstants:
  val PI = 3.14159
  val E = 2.71828

println(MathConstants.PI)


import scala.math.*

class Circle(val radius: Double):
  def area: Double = Circle.calculateArea(radius)

object Circle:
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)

val circle1 = Circle(5.0)
circle1.area


class Person:
  var name = ""
  var age = 0
  override def toString = s"$name is $age years old"

object Person:

  // фабричный метод с одним аргументом
  def apply(name: String): Person =
    var p = new Person
    p.name = name
    p

  // фабричный метод с двумя аргументами
  def apply(name: String, age: Int): Person =
    var p = new Person
    p.name = name
    p.age = age
    p

end Person

val joe = Person("Joe")
val fred = Person("Fred", 29)