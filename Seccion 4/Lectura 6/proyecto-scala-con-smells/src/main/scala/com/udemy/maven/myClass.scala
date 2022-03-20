package com.udemy.maven



class myClass {

  def methodHello(time: String): String = {
    if (time == "morning") {
      return "Good morning!"
    }
    if (time == "afternoon") {
      return "Good afternoon!"
    }
    else  {
      return "Good evening!"
    }
  }

  def todayIs(dayOfWeek: String): Unit = {
   dayOfWeek match {
      case "1" => println("Today is Monday")
      case "2" => println("Today is Tuesday")
      case "3" => println("Today is Wednesday")
      case "4" => println("Today is Thursday")
      case "5" => println("Today is Friday")
      case _ => println("Today is Weekend!")
    }

  }

  def sumRestIntegers(number1: Integer, number2: Integer, operation: String = "s"): Integer = {
    if (operation == "s") {
      number1 + number2
    } else {
      number1 - number2
    }
  }

}
