package com.learn.scala

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.mutable._
import org.specs2.specification.Scope



@RunWith(classOf[JUnitRunner])
class DencryptorTest extends Specification {

  class Context extends Scope {
    val sampleString = "abc1"
  }
  "Convert hex char to byte " should {
    "convert abc" in new Context {
      val dencryptor = new Dencryptor()
      dencryptor.hexToByte(sampleString) must have size(4)
    }
  }
}
