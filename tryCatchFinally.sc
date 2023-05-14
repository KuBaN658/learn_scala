val s = "38х"

try
  val num = s.toInt
catch
  case nfe: NumberFormatException => println("ошибка формата")
finally
  println("Это выполнится в любом случае")



