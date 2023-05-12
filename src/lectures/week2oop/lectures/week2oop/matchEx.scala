package lectures.week2oop.lectures.week2oop

object matchEx extends App {
  val flag = false
  val arg = if flag then "salt" else "nan"

  arg match
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")

  val product =
  arg match
    case "salt" => "pepper"
    case "chips" => "salsa"
    case "eggs" => "bacon"
    case _ => "huh?"
    
  println(product)
}
