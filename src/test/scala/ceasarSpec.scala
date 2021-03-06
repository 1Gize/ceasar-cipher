import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import CeasarCipher._

class ceasarSpec extends AnyFlatSpec with should.Matchers{

  "caesar" should "return string abcz for input string abcz and offset" in {
    ceaser("abcz", 26*5) shouldBe "abcz"
  }
  it should "return b for input(a, 1)" in{
    ceaser("a", 1) shouldBe "b"
  }
  it should "return bcda for input(abcz, 1)" in{
    ceaser("abcz", 1) shouldBe "bcda"
  }
  it should "return vex for input(irk, 13)" in{
    ceaser("irk", 13) shouldBe "vex"
  }
  it should "return layout for input(fusion, 6)" in{
    ceaser("fusion", 6) shouldBe "layout"
  }
  it should "return jgorevxumxgsskx for input(dailyprogrammer, 6)" in{
    ceaser("dailyprogrammer", 6) shouldBe "jgorevxumxgsskx"
  }
  it should "return dailyprogrammer for input(jgorevxumxgsskx, 20)" in{
    ceaser("jgorevxumxgsskx", 20) shouldBe "dailyprogrammer"
  }
}
