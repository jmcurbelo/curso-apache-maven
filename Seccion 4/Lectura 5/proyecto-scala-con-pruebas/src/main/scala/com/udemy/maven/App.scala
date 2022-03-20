package com.udemy.maven

import java.util.Calendar

/**
 * @author ${José Miguel Moya}
 */
object App {
  
  def main(args : Array[String]) {

    val time = "morning"
    val today = Calendar.DAY_OF_WEEK.toString

    val myClass = new myClass()

    println(myClass.methodHello(time))
    myClass.todayIs(today)
  }

}
