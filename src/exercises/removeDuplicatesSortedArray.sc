val arr = Array(0, 1, 2, 2, 3, 4, 4, 5)


def removeDuplicates(nums: Array[Int]): Int = {
  val res = nums.distinct
  for (i <- 0 until res.length) {
    nums(i) = res(i)
  }
  res.length
}

val resultingArray  = arr.distinct
resultingArray.zipWithIndex.foreach { case(item, index) => arr(index) = item }
resultingArray.length

removeDuplicates(arr)
arr
val arr2 = Array(1, 1, 1)
removeDuplicates(arr2)
arr2