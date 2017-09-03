// Usage: scala xor.scala
import java.math.BigInteger

case class Hex(private val hexStr: String) {
	val hex = new BigInteger(hexStr, 16)
	def xor(another: Hex) = (hex xor another.hex).toString(16)
} 

println(Hex("30167b0eb4eef511ec82272b4b47a2d71471") xor Hex("1319057cb23c1dcbf616876372617fff8b48"))