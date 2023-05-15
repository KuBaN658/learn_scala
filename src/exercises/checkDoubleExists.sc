val arr = Array(1, 2, 3, 4, 5, 6)

def checkIfExist(arr: Array[Int]): Boolean = {
  // Zero check
  if (arr.filter(_ == 0).length > 1) true
  else arr.filter(_ != 0).map(2 * _).exists(arr.contains)
}

arr.filter(_ != 0).map(2 * _).exists(a => arr.contains(a))