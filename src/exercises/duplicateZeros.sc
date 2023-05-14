val arr = Array(9,0,9,0,6,0,0,0,1,1,6,5,4,4,8,3,0,0,0,1,5,3,0,0,7,2,1,0,2,0,9,1,0,2,0,0,0,0,0,0,0,6,0,0,7,9,0,8,7,0,9,7,1,0,2,0,0,0,0,9,0,0,0,0)

def duplicateZeros(arr: Array[Int]): Unit = {
  val copyArr = arr.clone
  var index = 0
  var index_clone = 0
  while (index < arr.length) {
    if (copyArr(index_clone) == 0) {
      arr(index) = 0
      if (index + 1 < arr.length) {
        index += 1
        arr(index) = 0
      }
    } else if (index < arr.length) {
        arr(index) = copyArr(index_clone)

    }
    index += 1
    index_clone += 1
  }
}
duplicateZeros(arr)
arr