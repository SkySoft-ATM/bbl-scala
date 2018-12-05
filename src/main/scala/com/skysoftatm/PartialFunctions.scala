package com.skysoftatm

object PartialFunctions {
  def main(args: Array[String]): Unit = {
    val somethingStrange = speed(100, _: Float)

    // Use case example
    val f: Int => Int = methodDependingOfAContext(new Context(), _: Int)
    higherOrderFunction(1, f)

    /*
     In Java?
     Context would have been part of an object leading to an impure function

     Reminder: a pure function is a function where
     - Where the return value is only determined by its input values
     - Without observable side effects
     */
  }

  def speed(distance: Float, time: Float): Float = {
    distance / time
  }

  def higherOrderFunction(i: Int, f: Int => Int): Int = {
    f(i)
  }

  def methodDependingOfAContext(context: Context, i: Int): Int = {
    // Do something depending of the context
    if (context.isIncrement()) {
      return i + 1
    } else {
      return i * 2
    }
  }
}
