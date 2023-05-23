import scala.collection.mutable

def add(network: Map[String, Set[String]], location: String): Map[String, Set[String]] = {
  network + (location -> Set[String]())
}

def disconnect(network: Map[String, Set[String]], PointA: String, PointB: String): Map[String, Set[String]] = {
  network + (PointA -> (network(PointA) - PointB)) + (PointB -> (network(PointB) - PointA))
}

def remove(network: Map[String, Set[String]], location: String): Map[String, Set[String]] = {
  def loop(destinations: Set[String], acc: Map[String, Set[String]]): Map[String, Set[String]] = {
    if (destinations.isEmpty) acc
    else loop(destinations.tail, disconnect(acc, location, destinations.head))
  }
  loop(network(location), network) - location
}

def connect(network: Map[String, Set[String]], PointA: String, PointB: String): Map[String, Set[String]] = {
  network + (PointA -> (network(PointA) + PointB)) + (PointB -> (network(PointB) + PointA))
}

def nFlights(network: Map[String, Set[String]], location: String): Int = {
  network(location).size
}

def mostFlights(network: Map[String, Set[String]]): String = {
  val max_value = network.values.map(_.size).max
  network.filter(_._2.size == max_value).keys.toList(0)
}

def nLocationsWithNoFlights(network: Map[String, Set[String]]): Int = {
  network.filter(_._2.isEmpty).size
}

def isConnected(network: Map[String, Set[String]], pointA: String, pointB: String): Boolean = {
  def check_node(node: String): Boolean = {
    network(node).contains(pointB)
  }
  val dic: Map[String, Int] = Map(pointA -> 0)

  def loop(point: String, que: Map[String, Int]): Boolean = {
    val n_que = (que + (point -> 1)) ++ network(point).filterNot(que.contains).map((_, 0)).toMap
    if (check_node(point)) true
    else if (n_que.filter(_._2 == 0).isEmpty) false
    else loop(n_que.filter(_._2 == 0).head._1, n_que)
  }
  loop(pointA, dic)
}



