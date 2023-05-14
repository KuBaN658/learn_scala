def f(x: Int): Int = x - 1

var x = 5
while x >= 0 do
  println(x)
  x = f(x)

x = 5
while (x > 0) {
  println(x)
  x += 1
}
