val lst = List("java", "scala", "python")

lst.map(_.toUpperCase)
val progLanguages = List("java", "scala", "python")
val lngAbbrev = List("JA", "SCA", "PY")

val out = {
  for {
    lng <- progLanguages
    abb <- lngAbbrev
    if lng.contains(abb.toLowerCase)
  } yield (abb, lng)
}
out

def fil(tup: Tuple2[String, String]): Boolean = {
  tup(1).contains(tup(0).toLowerCase)
}


val out2 = lngAbbrev.flatMap(abrv => progLanguages
.filter(_.contains(abrv.toLowerCase())).map(lng => (abrv, lng)))


Seq(3,4,3,3).sorted.search(3)

val sampleTuple = new Tuple2(2, "Hello, World")
sampleTuple.copy(_2 = "Scala").swap._1 + 5


val nums1 = List(1, 2, 3)
val nums2 = List(4, 6, 7)
val nums3 = List(10, 100, 1000)


nums1.flatMap(a => nums2.filter(_ % 2 == 1).flatMap(b => nums3.map(c => (a + b) * c)))

for {
  a <- nums1
  b <- nums2 if b % 2 == 1
  c <- nums3
} yield (a + b) * c