val i = 2


val numAsString = i match {
  case 1 | 3 | 5 | 7 | 9 => "odd"
  case 2 | 4 | 6 | 8 | 10 => "even"
  case _ => "to big"
}

i match
  case 1 => println("one")
  case 2 => println("two")
  case _ => println("other")

def getClassAsString(x: Matchable): String = x match
  case s: String => s"'$s' is a String"
  case i: Int => "Int"
  case d: Double => "Double"
  case l: List[?] => "List"
  case _ => "Unknown"

getClassAsString(1)
getClassAsString("hello")
getClassAsString(List(1, 2, 3))
getClassAsString(0.3F)