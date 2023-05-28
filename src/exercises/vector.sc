val field = (1 to 10).toVector.map(_ => (1 to 10).toVector.map(_ => false))

val slc = field.slice(1, 4).map(_.slice(1, 4))

slc.forall(_.forall(x => x == false))

val ship = List((1, 2), (1, 3), (1, 4))

println(ship.map(x => field.slice(x._1 - 1, x._1 + 2).map(_.slice(x._2 - 1, x._2 + 2))))