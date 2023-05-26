def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
  if (q._1 == 0 || p._2 == 0) Left("Zero divisor")
  else if(p._1 >= p._2 || q._1 >= q._2) Left("Invalid input")
  else {
    val numerator = p._1 * q._2
    val denominator = p._2 * q._1
    if (numerator >= denominator) Left("Improper result")
    else {
      val greComDiv = BigInt(numerator).gcd(BigInt(denominator))
      Right((numerator / greComDiv).toInt, (denominator / greComDiv).toInt)
    }
  }
}

divide((4, 9))(9, 12)