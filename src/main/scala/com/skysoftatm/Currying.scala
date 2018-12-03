package com.skysoftatm

object Currying {
  def multiply(n1: Int, n2: Int): Int = {
    n1 * n2
  }

  def multiplyCurrying(n1: Int)(n2: Int): Int = {
    n1 * n2
  }

  def higherOrderFunction(i: Int, f: Int => Int): Int = {
    f(i)
  }

  def methodDependingOfAContext(i: Int)(implicit context: Context): Int = {
    // Do something depending of the context
    if (context.isIncrement()) {
      return i + 1
    } else {
      return i * 2
    }
  }

  def main(args: Array[String]): Unit = {
    // Simple function call
    multiply(2, 3)

    // Currying function call
    multiplyCurrying(2)(3)

    // Use-case: syntactic sugar
    val m = Array.ofDim[Int](3, 3)
    m(0)(0) = 5

    // Use-case: partial function
    var partial = multiply(2, _: Int)
    partial = multiplyCurrying(2)

    // Use case: higher-order function call
    implicit val context = new Context()
    higherOrderFunction(4, methodDependingOfAContext)
  }
}
