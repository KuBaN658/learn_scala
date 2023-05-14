val nums = Array(1, 1, 1, 0, 0, 0, 0, 1)

def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
  def loop(index: Int = 0, count: Int = 0, max_count: Int = 0): Int = {
    if (index == nums.length)
      if (max_count > count) max_count else count
    else loop(index + 1, if (nums(index) == 0) 0 else count + 1, if (max_count < count) count else max_count)

  }
  loop()
}

findMaxConsecutiveOnes(Array(1, 1, 1, 0, 0, 0, 1, 1, 1, 1))