package lectures.week1basics
// массив изменяемый обьект
// создание массива
object arrayClass extends App {
  val greetStrings: Array[String] = new Array[String](3)

  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
   print(greetStrings(i))

  // создание массива
  val numNames = Array("zero", "one", "two")
  val copy: Array[String] = new Array[String](3)
    numNames.copyToArray(copy)

  println(greetStrings.sameElements(numNames))
  println(copy.sameElements(numNames))


}
