// Генерируется метод unapply, copy, equals и hashCode, toString

case class Person(name: String, relation: String)

val christina = Person("Christina", "niece")

// Case class-ы можно использовать в качестве шаблонов
christina match
  case Person(n, r) => println("name is " + n)

// для вас генерируются методы `equals` и `hashCode`
val hannah = Person("Hannah", "niece")
christina == hannah       // false

// метод `toString`
println(christina)        // Person(Christina,niece)

// встроенный метод `copy`
case class BaseballTeam(name: String, lastWorldSeriesWin: Int)
val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)


