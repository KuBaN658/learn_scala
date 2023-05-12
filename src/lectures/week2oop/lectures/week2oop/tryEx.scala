package lectures.week2oop.lectures.week2oop

object tryEx extends App {

  import java.io.FileReader
  import java.io.FileNotFoundException
  import java.io.IOException


  try
    val f = new FileReader("input.txt")


  catch
    case ex: FileNotFoundException => // обработка ошибки отсутствия файла
      println("обработка ошибки отсутствия файла")
    case ex: IOException => // обработка других ошибок ввода вывода
      println("обработка других ошибок ввода вывода")
  finally
    println("выполняется в любом случае!!!")

  import java.net.URL
  import java.net.MalformedURLException

  def urlFor(path: String) =
    try
      new URL(path)
    catch
      case ex: MalformedURLException =>
        URL("http://www.scala-lang.org")

  println(urlFor("jjj"))
}
