// функции высшего порядка — функции, которые принимают функцию в качестве параметра.
val lst = List(1, 2, 3)

lst.map(i => i * 2)
lst.map(_ * 2)

def double(i: Int): Int = i * 2

lst.map(i => double(i))
lst.map(double)

val nums = (1 to 10).toList

val x = nums.filter(_ > 3).filter(_ < 7).map(_ * 10)

