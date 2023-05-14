List.range(1, 4)
List.range(start = 1, end = 6, step = 2)
List.fill(4)(0)
List.tabulate(4)(n => n * n)

val a = List(10, 20, 30, 40, 10)
a.distinct
a.drop(2)
a.dropRight(2)
a.dropWhile(_ < 40)
a.filter(_ < 30)
a.find(_ > 20)
a.head
a.headOption
a.init  // без последнего
a.intersect(List(19, 20, 21))
a.last
a.lastOption
a.map(_ * 2)
a.slice(2, 4) // последний индекс не входит
a.tail // без первого
a.take(3) // первые три
a.takeRight(2) // последние два
a.takeWhile(_ < 40)
a.filter(_ < 30).map(_ * 10)

val fruits = List("apple", "pear")
fruits.map(_.toUpperCase)
fruits.flatMap(_.toUpperCase)

val nums = List(10, 5, 8, 1, 7)
nums.sorted
nums.sortWith(_ < _)
nums.sortWith(_ > _)

