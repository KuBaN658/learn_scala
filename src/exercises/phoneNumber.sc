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