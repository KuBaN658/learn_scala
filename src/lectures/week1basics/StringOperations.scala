package lectures.week1basics

object StringOperations extends App {
  val aString: String = "Hello, world!"

  println(aString.length) // выводит длину строки
  println(aString.charAt(1)) // выводит символ с индекксом 1
  println(aString.substring(0, 2)) // выводит подстроку с 0 по 2 не включительно
  println(aString.split(" ").toList) // выводит List(Hello,, world!)
  println(aString.startsWith("He")) // выводит true
  println(aString.replace("!", ".")) // выводит Hello, world.
  println(aString.toLowerCase) // выводит hello, world!
  println(aString.toUpperCase) // выводит HELLO, WORLD!
  println("abcd".reverse) // выводит dcba
  println("abcd".take(2)) // выводит ab


  val aNumber = "42".toInt
  println(aNumber) // выводит 42
  println(aNumber.getClass) // выводит int

  val str = 42.toString // преобразование числа в строку

  println('1' +: "42" :+ '3') // присоединяем одиночные символы
  println('a' +: "bc" :+ 'd') // снова присоед одиночные
  println("a" ++ "bc" :++ "d") // присоединяем сначала "вс" потом "d"

  val name = "John"
  println(s"Hello, $name") // выводит Hello, John
  val surname = "Smith"

  println(s"Hello, ${name + surname}") // выводит Hello, JohnSmith
}
