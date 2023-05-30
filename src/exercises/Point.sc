case class Point(x: Double, y: Double, z: Double)

case object Point {
  def apply(x: Double, y: Double, z: Double): Point = new Point(x, y, z)

  def average(lst: List[Point]): Point = {
    if (lst.nonEmpty) {
      val res: Point = lst.reduce((a, b) => new Point(a.x + b.x, a.y + b.y, a.z + b.z))
      new Point(res.x / lst.size, res.y / lst.size, res.z / lst.size)
    } else new Point(0, 0, 0)
  }

  def show(point: Point): String = f"${point.x} ${point.y} ${point.z}"
}