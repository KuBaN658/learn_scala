val func: PartialFunction[String, String] = {
  case "hello" => "Hi, I'm Bot"
  case "bye" => "Bye-bye"
  case "what's up" => "sup-sup"
}

val chatbot = func.lift

chatbot("by")


scala.io.Source.stdin.getLines()