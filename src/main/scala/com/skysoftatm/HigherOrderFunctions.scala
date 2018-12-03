package com.skysoftatm

object HigherOrderFunctions {
  /*
   A higher-order function takes as parameters a function or return a function
  */

  // Takes a function
  def foo(i: Int, f: Int => Int): Int = {
    f(i)
  }

  def main(args: Array[String]): Unit = {
    // How to invoke an higher-order function?

    // Function literal (assigning a function to a value)
    val increment: Int => Int = (x: Int) => x + 1
    foo(1, increment)

    // Anonymous function
    foo(1, (x: Int) => x * 2)
  }
}
