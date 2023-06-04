(1 to 1000000000).to(LazyList).map(_ * 3).take(5).filter(_ <= 6).foreach(println)

val lazyList = 1 #:: 2 #:: 3 #:: LazyList.empty

lazyList.last

val capacity = 100

val power = 0


LazyList.fill(capacity)(BigInt(2)).scanLeft(BigInt(2))(_ * _).take(power).toList