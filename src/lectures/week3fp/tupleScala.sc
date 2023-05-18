val aTuple: (Int, String) = (100, "Scala")

val sameTuple: (Int, String) = Tuple2(100, "Scala")

aTuple

aTuple(1)
aTuple._2

val copy: (Int, String) = aTuple.copy(_2 = "Python")

aTuple.swap