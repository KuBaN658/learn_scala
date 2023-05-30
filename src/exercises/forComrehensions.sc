val list1 = List(1, 3, 5, 7)
val list2 = List(2, 4, 6, 8)
val list3 = List(1, 3, 5, 8, 10, 12, 14)

for {
  x <- list1
  y <- list2
  z <- list3
  if x != y && x * y == z
} println(f"($x,$y)")

for { x <- List(1,2,3,4) } x

for { (k,v) <- Map("a" -> 1, "b" -> 2) } yield k

for { x <- Some(1) ; y <- None } yield (x, y)

list3 :+ 1

"akdfpoa".slice(0, 20) + "..."