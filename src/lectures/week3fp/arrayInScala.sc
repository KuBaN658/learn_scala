val anArray: Array[String] = Array("h", "e", "l", "l", "o", ".")

anArray(5) = "!"

anArray.mkString("-")

val twoElements: Array[Boolean] = Array.ofDim[Boolean](10)

twoElements.foreach(println)

val numberSeq: Seq[String] = anArray

