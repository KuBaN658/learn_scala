def removeElement(nums: Array[Int], `val`: Int): Int = {
  val res = nums.filter(_ != `val`)
  for (i <- 0 until res.length) {
      nums(i) = res(i)
  }
  res.length
}

def removeElement2(nums: Array[Int], z: Int): Int = {
  nums.foldLeft(0) {
    case (index, value) if value != z =>
      nums(index) = value
      index + 1
    case (index, value) =>
      nums(index) = value
      index
  }
}

val arr = Array(0, 1, 2, 2, 3, 0, 4, 2)

removeElement(arr, 2)
arr.foreach(print)
