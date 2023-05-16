val i = 2
//
//
//val numAsString = i match {
//  case 1 | 3 | 5 | 7 | 9 => "odd"
//  case 2 | 4 | 6 | 8 | 10 => "even"
//  case _ => "to big"
//}
//
//i match
//  case 1 => println("one")
//  case 2 => println("two")
//  case _ => println("other")
//
//def getClassAsString(x: Matchable): String = x match
//  case s: String => s"'$s' is a String"
//  case i: Int => "Int"
//  case d: Double => "Double"
//  case l: List[?] => "List"
//  case _ => "Unknown"
//
//getClassAsString(1)
//getClassAsString("hello")
//getClassAsString(List(1, 2, 3))
//getClassAsString(0.3F)

//val N = 42
//i match
//  case 0 => println("1")
//  case 1 => println("2")
//  case N => println("42")
//  case n => println(s"You gave me: $n" )


//i match
//  case a if 0 to 9 contains a => println(s"0-9 range: $a")
//  case b if 10 to 19 contains b => println(s"10-19 range: $b")
//  case c if 20 to 29 contains c => println(s"20-29 range: $c")
//  case _ => println("Hmmm...")


//case class Person(name: String)
//
//def speak(p: Person) = p match
//  case Person(name) if name == "Fred" => println(s"$name says, Yubba dubba doo")
//  case Person(name) if name == "Bam Bam" => println(s"$name says, Bam bam!")
//  case _ => println("Watch the Flintstones!")
//
//println(speak(Person("Fred")))
//println(speak(Person("Dimon")))



//def pattern(x: Matchable): String = x match
//
//  // сравнение с константой
//  case 0 => "zero"
//  case true => "true"
//  case "hello" => "you said 'hello'"
//  case Nil => "an empty List"
//
//  // сравнение с последовательностями
//  case List(0, _, _) => "a 3-element list with 0 as the first element"
//  case List(1, _*) => "list, starts with 1, has any number of elements"
//  case Vector(1, _*) => "vector, starts w/ 1, has any number of elements"
//
//  // сравнение с кортежами
//  case (a, b) => s"got $a and $b"
//  case (a, b, c) => s"got $a, $b, and $c"
//
//  // сравнение с конструктором класса
//  case Person(first, "Alexander") => s"Alexander, first name = $first"
//  case Dog("Zeus") => "found a dog named Zeus"
//
//  // сравнение по типу
//  case s: String => s"got a string: $s"
//  case i: Int => s"got an int: $i"
//  case f: Float => s"got a float: $f"
//  case a: Array[Int] => s"array of int: ${a.mkString(",")}"
//  case as: Array[String] => s"string array: ${as.mkString(",")}"
//  case d: Dog => s"dog: ${d.name}"
//  case list: List[?] => s"got a List: $list"
//  case m: Map[?, ?] => m.toString
//
//  // значение по умолчанию с подстановочным знаком
//  case _ => "Unknown"
