// Значения перечислений можно сравнивать (==)
// и использовать в сопоставлении:

enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions


import CrustSize.*
val currentCrustSize = Large

if currentCrustSize == Large then
  println("You get a prize!")

currentCrustSize match
  case Small => println("small")
  case Medium => println("medium")
  case Large => println("large")


enum Color(val rgb: Int):
  case Red   extends Color(0xFF0000)
  case Green extends Color(0x00FF00)
  case Blue  extends Color(0x0000FF)


enum Planet(mass: Double, radius: Double):
  private final val G = 6.67300E-11
  def surfaceGravity = G * mass / (radius * radius)
  def surfaceWeight(otherMass: Double) =
    otherMass * surfaceGravity

  case Mercury extends Planet(3.303e+23, 2.4397e6)
  case Earth   extends Planet(5.976e+24, 6.37814e6)