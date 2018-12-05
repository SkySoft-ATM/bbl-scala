package com.skysoftatm

object MethodsBasics {
  def main(args: Array[String]): Unit = {
    // Method != Function
    // Method is a member of a class, trait or object

    // Basic method definition
    val sum = add(1, 2)

    // Multiple outputs
    val a, b = multipleOutputs()

    // Parenthesis are optional
    val x, y = multipleOutputs

    // Best practice: keep parenthesis if side-effect

    // Variable-arguments
    varargs(1, 2, 3, 4, 5)

    // Named parameters
    default(0, 2)
    default(x = 0, y = 2)

    // Default value
    default(_: Int, y = 2)
    default(y = 2)
    // default(x = 1) // Compilation error (missing required argument)
  }

  // Arguments are values
  // Three optional things (return keyword, blocks, return type)
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def multipleOutputs(): (Int, Int) = (1, 2)

  def varargs(args: Int*) = {}

  def default(x: Int = 1, y: Int): Int = {
    x * y
  }
}
