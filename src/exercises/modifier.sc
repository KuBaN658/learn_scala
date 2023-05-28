class Modifier(val someVar: Any) {
  def get: Any = someVar

  var modifier: Any = "Anything"

  def set: Any = modifier
}

val list = (10 to 150).toList

list.filter(x => x < 100 && x % 4 == 0).map(_ / 4).init.foreach(println)
