import scala.collection.mutable.ListBuffer

object CeasarCipher {
  def ceaser(word: String, offset: Int) = {
    word.map(c => moveChar(c, offset))

  }

  def moveChar(c: Char, x: Int) = {
    val newChar = (c.toInt + x).toChar
    if (newChar.toInt > 122) {
      val finalChar = (newChar.toInt - 26).toChar
      finalChar
    } else {
      newChar
    }
  }
}
