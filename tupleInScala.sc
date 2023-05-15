case class Person(name: String)

val tup = (11, "eleven", Person("Eleven"))
tup(0)
tup(1)
tup(2)

val (num, str, person) = tup