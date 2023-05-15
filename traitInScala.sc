trait AddService:
  def add(a: Int, b: Int) = a + b

trait MultiplyService:
  def multiply(a: Int, b: Int) = a * b

// реализация трейтов выше в качестве конкретного объекта
object MathService extends AddService, MultiplyService

// использование объекта
import MathService.*
println(add(1,1))        // 2
println(multiply(2,2))