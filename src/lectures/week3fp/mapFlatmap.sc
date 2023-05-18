val list1 = List(1, 2)
val list2 = List("a", "b")

val combinations = list1.flatMap(n => list2.map(c => n + c))
combinations

for
  n <- list1
  c <- list2
yield n + c
