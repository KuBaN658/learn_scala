val arr = Array(1, 1, 2, 4)

arr.sortInPlaceWith(_ < _)
val res = for {
  i <- 0 until arr.length - 1
  if arr(i + 1) - arr(i) > 1
} yield List.range(arr(i) + 1, arr(i+1))
println(res)
List.range(1, arr.min) ++ res.toList.flatten ++ List.range(arr.max + 1, arr.length + 1)

