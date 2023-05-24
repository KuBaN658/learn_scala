import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
  val weightPotato: BigDecimal = weight - weight * BigDecimal(potatoWaterRatio)
  (weightPotato / (1 - BigDecimal(crispsWaterRatio))).setScale(5, HALF_UP)
}

crispsWeight(90, 0.9, 0.1)

"01001110100".count(_ == '1')

val s1 = "foo"
val s2 = "foo"

s1 == s2
s1 eq s2

'a'.toInt
'A'.toInt
"ScaLa"(3) < 'a'

'a'.isLetter

val numbers = "2 6"
val str = "foobarbaz"
val indexes = numbers.split(' ').map(_.toInt)
val startIndex = indexes(0)
val endIndex = indexes(1)
print(str.slice(0, startIndex))
print(str.slice(startIndex, endIndex + 1).reverse)
print(str.slice(endIndex + 1, str.length))


val pattern = raw"[a-z]+(_[a-z]+)*".r

val name = "snake_case"

pattern.matches(name)
