def unsafeMethod(): String = null
def safeMethod(): String = "There is a String"

val unsafeRes = Option(unsafeMethod())
val safeRes = Option(safeMethod())

unsafeRes.isEmpty
safeRes.isEmpty


val chainedResult = Option(unsafeMethod())
  .orElse(Option(safeMethod())).isEmpty

