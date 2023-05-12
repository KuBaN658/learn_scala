package lectures.week2oop

import java.util.regex.Pattern

object ifWhileFor extends App {

  val flag: Boolean = true
  val filename = if flag then "nodefault.txt" else "default.txt"

  def gcdLoop(x: Long, y: Long): Long =
    var a = x
    var b = y
    while a != 0 do
      val temp = a
      a = b % a
      b = temp

    b

  println(gcdLoop(28, 49))

  import scala.io.StdIn.readLine

  while
    val line = readLine()
    println(s"Read: $line")
    line != ""
  do ()

  def gcd(x: Long, y: Long): Long =
    if y == 0 then x else gcd(y, x % y)

  println(gcd(28, 49))

  val filesHere = (java.io.File(".")).listFiles

  for file <- filesHere do
    println(file)

  for i <- 1 to 5 do
    println(s"iteration: $i")

  for i <- 1 until 5 do
    println(s"iteration: $i")

  for i <- 0 until filesHere.length do
    println(filesHere(i))

  for file <- filesHere do
    if file.getName.endsWith(".iml")
    then
      println(file)

  for file <- filesHere do
    if file.isFile && file.getName.endsWith(".iml")
    then
      println(file)


  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines()

  def grep(pattern: String) =
    for file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(pattern)
    do println(s"$file: $trimmed")

  grep(".*gcd.*")

  def imlFiles =
    for file <- filesHere
        if file.getName.endsWith("ml")
    yield file // возвращает Array[File] потому что filesHere - Arraу, а file - File


  def half(n: Int): Int =
    if n % 2 == 0 then
      n / 2
    else
      throw new RuntimeException("n must be even")

  half(36)
  
}
