package com.udemy.maven

import org.junit.Assert.assertEquals
import org.scalatest.FlatSpec

class myClassTest extends FlatSpec{

  "The method methodHello" should "return Good morning! when the time is morning" in {
    val time = "morning"
    val myClass = new myClass()
    assertEquals(
      myClass.methodHello(time), "Good morning!"
    )
  }
  it should "return Good afternoon! when the time is afternoon" in {
    val time = "afternoon"
    val myClass = new myClass()
    assertEquals(
      myClass.methodHello(time), "Good afternoon!"
    )
  }
  it should "return Good evening! when the time is different from morning and afternoon" in {
    val time = "night"
    val myClass = new myClass()
    assertEquals(
      myClass.methodHello(time), "Good evening!"
    )
  }

  "The method todayIs" should "return an Unit" in {
    val myClass = new myClass()
    assertEquals(
      myClass.todayIs("5"), ()
    )
  }

  "The method sumRestIntegers" should "return 22" in {
    val myClass = new myClass()
    assertEquals(
      myClass.sumRestIntegers(12, 10), 22
    )
  }

}
