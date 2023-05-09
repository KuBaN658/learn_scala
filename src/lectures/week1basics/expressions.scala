package lectures.week1basics

object expressions extends App {

 val aCondition = true
 val ifExpressionValue =
   if aCondition then "True Condition"
   else "FalseCondition"

 println(ifExpressionValue)

 val someVal: Unit
 = print("It is just a value")
 println(someVal)
}
