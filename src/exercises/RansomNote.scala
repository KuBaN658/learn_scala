package exercises

object RansomNote extends App {
  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val dict = Map()
    ransomNote.diff(magazine).isEmpty

  }
}
