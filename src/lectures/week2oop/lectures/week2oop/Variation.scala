package lectures.week2oop.lectures.week2oop

object Variation {
  class Fruit
  class Apple extends Fruit
  class Banana extends Fruit
  class InvariantList[A]
  class ContrvariantList[-A]
  class CovariantList[+A]

  val invariantFruitList: InvariantList[Fruit] = InvariantList[Fruit]

  val contrvariantList: ContrvariantList[Apple] = new ContrvariantList[Fruit]

  val fruitList: CovariantList[Fruit] = new CovariantList[Apple]
  val fruitList2: CovariantList[Fruit] = new CovariantList[Banana]

}
