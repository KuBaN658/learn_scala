val aMap: Map[String, Int] = Map()

val colors: Map[String, String] =
  Map(("black", "#000000"), "blue" -> "#0d1ad1", ("blue", "#161f96"))
    .withDefaultValue("na")

colors

colors.contains("black")
colors("black")

colors("red")

val color: (String, String) = "green" -> "#339616"

val newColors: Map[String, String] = colors + color


newColors

colors.toList
List(("White", "#ffffff")).toMap