val nums1 = Array(1, 2, 3, 0, 0, 0)
val m = 3
val nums2 = Array(2, 5, 6)
val n = 3


def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
  var count = 0
  for (i <- m until nums1.length) {
    nums1(i) = nums2(count)
    count += 1
  }
  nums1.sortInPlace
}

merge(nums1, m, nums2, n)
nums1


