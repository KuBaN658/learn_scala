val lst = List(1,2,3,4,5,6,1)

lst.filter(_ % 2 == 0).map(x => x * x)

// partition возвращает кортеж двух
// коллекций удовл и не удовл предикату
lst.partition(_ % 2 != 1)

// у zip на входе две коллекции
// возвращает коллекцию кортежей
val numbers = (0 until 7).toList
numbers.zip(lst)

// получаем (element, index)
lst.zipWithIndex

// ищет элемент удовлетворяющий предикату
  lst.find(_ < 0) match {
    case Some(value) => println(value)
    case None => println("нет отрицательных элементов")
  }

// forall и exist получают предикат
// forall для всех элементов выполняется условие
// exist хотя бы для одного выполняется условие
lst.forall(_ < 10)
lst.exists(_ >= 7)

lst.zip(numbers).forall {
  case (a, b) => a > b
}

// drop выбрасывает n первых элементов
lst.drop(3)

// dropWhile выбрасывает пока предикат верен
lst.dropWhile(_ < 4)

// take берет превые n элементов
lst.take(3)

// takeWhile берет пока предикат верен
lst.takeWhile(_ < 4)

// flatMap принимает каждый элемент возвращает
// коллекцию для каждого элемента и конкатенирует их
lst.flatMap(x => List(x, x*x, x*x*x))
lst.flatMap(x => x.toString)

// distinct уникальные элементы коллекции
lst.distinct

// foldLeft сворачивает коллекцию применяя
// функцию к элементу и предыдущего результата
lst.foldLeft(0)((a, b) => a + b)
lst.foldLeft(1)((a, b) => a * b)
lst.foldLeft(Int.MaxValue)((a, b) => if a < b then a else b)

lst.foldLeft((0, 0)) {
  (a, b) => (a._1 + b, a._2 + 1)
}

