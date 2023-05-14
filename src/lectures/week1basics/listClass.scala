package lectures.week1basics

object listClass extends App {

  // Список неизменяемый обьект
  // создание списка
  val oneTwoThree = List(1, 2, 3)
  val threeFour = List(4, 5)

  // обьединение списков
  val listSum = oneTwoThree ::: threeFour
  println(listSum)

  // добавление в начало списка
  val zeroList = 0 :: oneTwoThree
  println(zeroList)

  // Nil - пустой список
  val list = 1 :: 2 :: 3 :: Nil
  println(list)

  // List.empty или Nil создает пустой список

  list(1) // возвращает элемент с индексом 1

  println(list.drop(2)) // возвращает список без первых двух элементов

  println(list.dropRight(2)) // возвращает список без последних двух элементов

  println(list.exists(num => num == 2)) // проверяет наличие 2 в массиве

  println(list.filter(num => num < 2)) // фильтрация элементов
  println(list.filterNot(num => num < 2))

 println(list.forall(num => num < 4)) // проверяет все ли элементы меньше 4

  println(list.foreach(num => println(num))) // действие для каждого элемента
  println(list.foreach(println)) // то же

  println(list.head) // возвращает первый элемент в списке

  println(list.init) // возвращает все элементы кроме последнего
  println(list.tail) // возвращает все элементы кроме первого

  println(list.isEmpty) // проверяет пуст ли список

  println(list.last) // возвращает последний элемент

  println(list.length) // возвращает длину списка

  println(list.map(num => num * num)) // действие для каждого элемента

  println(list.mkString("_")) // создает строку из элементов

  println(list.reverse) // возвращает список в обратном порядке

  println(list.sortWith((a, b) => a > b)) // возвращает отсортированный список
  println(list.sortWith(_ > _))

  println(list.find(_ == 2))

  println(list.takeWhile(_ < 3))


}
