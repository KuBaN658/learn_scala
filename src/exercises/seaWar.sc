val field = Vector.fill(10)(Vector.fill(10)(false))

val ship = List((5, 5), (5, 6), (5, 7))


ship.map(x=>x._1 < 10 && x._2 < 10 && x._1 >= 0 && x._2 >= 0).forall(_ == true)

val data = ship.map(x => field.slice(x._1 - 1, x._1 + 2)
  .map(y => y.slice(x._2 - 1, x._2 + 2))).flatten.flatten.forall(_ == false)


//    .forall(_.forall(_ == false))).forall(_ == false)