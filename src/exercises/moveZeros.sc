val arr = Array(0)

def moveZeroes(nums: Array[Int]): Unit = {
  var writePointer = 0
  var readPointer = 0
  var counter = 0
  val n = nums.length
  while (readPointer < n) {
    while (nums(readPointer) == 0 && readPointer < nums.length - 1) {
      counter += 1
      readPointer += 1
    }
    nums(writePointer) = nums(readPointer)
    writePointer += 1
    readPointer += 1
  }
  (n - counter until n).foreach(index => nums(index) = 0)
}

moveZeroes(arr)
arr