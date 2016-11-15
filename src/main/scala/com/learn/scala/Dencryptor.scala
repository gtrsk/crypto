package com.learn.scala

/**
  * Created by guoda on 11/14/2016.
  */
class Dencryptor {


	private def hexToByte(c: Char): Int =
	{
		val b =
			if(c >= '0' && c <= '9')
				(c - '0')
			else if(c >= 'a' && c <= 'f')
				(c - 'a') + 10
			else if(c >= 'A' && c <= 'F')
				(c - 'A') + 10
			else
				throw new RuntimeException("Invalid hex character: '" + c + "'.")
		b
	}

	def hexToByte(input: String): Array[Byte] = {
		require((input.length & 1) == 0, "Hex string must have length 2n.")
		val array = new Array[Byte](input.length >> 1)
		for(i <- 0 until input.length by 2)
		{
			val c1 = input.charAt(i)
			val c2 = input.charAt(i+1)
			array(i >> 1) = ((hexToByte(c1) << 4) | hexToByte(c2)).asInstanceOf[Byte]
		}
		array
  }
}
