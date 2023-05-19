val input = "9-876-543-21-09"
val res: Map[Char, Int] = Map().withDefaultValue(0)

val seq = for (chr <- input)
  yield res + (chr -> (res(chr) + 1))

input.split('-').mkString("")

def count_num(number: String): Map[Char, Int] = {
  def loop(number: String = number, dict: Map[Char, Int] = Map().withDefaultValue(0)): Map[Char, Int] = {
    if(number.length == 0) dict
    else if (dict.contains(number.head)) {
      loop(number.tail, dict + (number.head -> (dict(number.head) + 1)))
    }
    else loop(number.tail, dict + (number.head -> 1))
  }
  loop(input.split('-').mkString(""))
}
count_num(input)


def compare(v1: String, v2: String): Int = {
  val pre: String => Array[Int] = (str: String) => str.split("\\.").map((str: String) => str.toInt)
  val nums1: Array[Int] = pre(v1)
  val nums2: Array[Int] = pre(v2)
  val diff = nums1.length - nums2.length
  val addArr = Array.ofDim[Int](if (diff > 0) diff else diff * -1)
  val nums1full = if (diff < 0) nums1 ++ addArr else nums1
  val nums2full = if (diff > 0) nums2 ++ addArr else nums2
  val res = nums1full.zip(nums2full).filter(_ != _)
  if (res.length == 0) 0
  else if (res(0)._1 > res(0)._2) 1
  else -1
}

compare("0.9", "1.0")
