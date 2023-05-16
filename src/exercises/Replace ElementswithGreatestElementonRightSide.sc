val arr = Array(17,18, 5, 4, 6, 1)

arr.tail.scanRight(-1)(_ max _)

def replaceElements(arr: Array[Int]): Array[Int] = {
  for (i <- arr.indices) {
    if (i == arr.length - 1) {
      arr(arr.length - 1) = -1
    } else {
      var max = arr(i + 1)
      for (j <- i + 2 until arr.length) {
        if (arr(j) > max) {
          max = arr(j)
        }
      }
      arr(i) = max
    }
  }
  arr
}

replaceElements(arr).foreach(println)
