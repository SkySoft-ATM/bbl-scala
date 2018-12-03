package com.skysoftatm

object Closure {
  def main(args: Array[String]): Unit = {
    val Pi = 3.14

    // A closure depends on the value of something declared outside this function
    val foo = (n: Int) => {
      n * Pi
    }
  }
}
