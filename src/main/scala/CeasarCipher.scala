import scala.collection.mutable.ListBuffer

object CeasarCipher {
  def ceaser(word: String, offset: Int) = {
    def moveChar(c: Char, x: Int) = {
      val newChar = (c.toInt + x)
      if (newChar > 122) {
        (newChar - 26).toChar
      } else {
        newChar.toChar
      }
    }
    word.map(c => moveChar(c, offset%26))
  }
}
