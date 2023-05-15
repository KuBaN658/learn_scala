val arr = Array(0,1,2,3,4,5,6,7,8,9)


def validMountainArray(arr: Array[Int]): Boolean = {
  def isSorted(array: Array[Int], params: String = "asc"): Boolean = {
    var flag = true
    if (params == "desc") {
      for (i <- 1 until array.length) {
        if (array(i - 1) <= array(i)) {
          flag = false
        }
      }
      flag
    } else {
      for (i <- 1 until array.length) {
        if (array(i - 1) >= array(i)) {
          flag = false
        }
      }

    }
    if (array.length > 1) flag else false
  }

  if (arr.length < 3) false
  else {
    val peak = arr.indexOf(arr.max)

    val head = arr.take(peak + 1)
    val tail = arr.slice(peak, arr.length)
    isSorted(head) && isSorted(tail, "desc")
  }
}
validMountainArray(arr)
arr.slice(9, arr.length)
