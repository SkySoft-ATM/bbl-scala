package com.skysoftatm

object Basics {
  def main(args: Array[String]): Unit = {
    // Values
    val v1: String = "foo"
    // v1 = "foo2" // Compilation error (immutability)

    // Type inference
    val v2 = "bar"

    // Lazy interpretation
    lazy val v3 = Utils.foo()

    // Variable
    var counter = 0
    counter = counter + 1

    // Statically typed language
    var color = "red"
    // color = 5 // Compilation error

    // Expressions
    println(7)

    println {
      val i = 5
      i + 2 // Prints the last expression
    }

    /*
    Scala is a pure object-oriented language (no primitives)

    8 basic types:
      - Byte
      - Short
      - Int
      - Long
      - Float
      - Double
      - Char
      - Boolean
     */

    // String interpolation
    val b = true
    println(s"The result is $b")

    // Possibility to create our own interpolator
    // Utils.display(json"{result: $b}")
  }
}
