case class Course(id: Int, title: String)

implicit val courseOrdering: Ordering[Course] = Ordering.fromLessThan((a, b) =>
  if (a.id != b.id) a.id < b.id else a.title < b.title)

val courses = List(
  Course(0, "Scala"),
  Course(1, "Advanced Scala"),
  Course(4, "Spark"),
  Course(3, "Cats")

)

courses.sorted
