package com.skysoftatm

object IfElse {
  def main(args: Array[String]): Unit = {
    val condition1 = true
    val condition2 = false

    if (condition1) {
      // Do something smart
    } else if (condition2) {
      // Do something smart
    } else {
      // Do something smart
    }

    // An if-else statement is also an expression
    val x = 1
    val y = 2
    val max = if (x > y) x else y
  }

  def max(x: Int, y: Int) = if (x > y) x else y
}
