import scala.util.{Try, Failure, Success}

def unsafeMethod(): String = throw new RuntimeException("Sorry, not your day")
def myMethod(): String = "My method is valid"
val potentialFailure = Try(unsafeMethod())
println(potentialFailure)

val anotherPotentialFailure = Try {
  Try(unsafeMethod())
  "another failure"
}


potentialFailure.isSuccess

println(anotherPotentialFailure)

val executeWithTry = Try(unsafeMethod()).orElse(Try(myMethod()))
println(executeWithTry)

def methodWhichFails(): Try[String] = Failure(new RuntimeException("Ooops..."))
def methodWhichSucceeds(): Try[String] = Success("Everything is OK")

val tryMethods = methodWhichFails() orElse methodWhichSucceeds()

println(tryMethods) // Success(Everything is OK)