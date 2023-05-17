def thirdMax(nums: Array[Int]): Int = {
  var max1, max2, max3 = Int.MaxValue * - 1 - 1

  for (i <- nums.distinct) {

      if (i > max1) {
        max3 = max2
        max2 = max1
        max1 = i
      } else if (i > max2) {
        max3 = max2
        max2 = i
      } else if (i > max3) {
        max3 = i
      }

  }
  if (nums.contains(max3) && nums.distinct.length > 2) max3 else max1
}

Int.MaxValue * -1 - 1