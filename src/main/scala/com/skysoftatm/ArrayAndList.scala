package com.skysoftatm

object ArrayAndList {
  def main(args: Array[String]): Unit = {
    // An array is also an object
    val a = new Array[Int](2)

    // How do we set a value?

    // One possible way
    a.update(0, 1)

    // Standard way
    a(0) = 1
    a(1) = 2

    // Call an object just like if it was a function
    // Default apply() method

    // Initialization alternative
    val b = Array(1, 2)

    // Multi-dimensional array
    val m = Array.ofDim[Int](3, 3)
    m(0)(0) = 5

    // Despite being declared as a val, Array remains mutable

    // List structure
    val list = List(5, 2)
    // list(0) = 5 // Compilation error
  }
}
