package com.skysoftatm

object PartialFunctions {
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

  def speed(distance: Float, time: Float): Float = {
    distance / time
  }

  def main(args: Array[String]): Unit = {
    val somethingStrange = speed(100, _: Float)

    // Use case?
    val f = methodDependingOfAContext(new Context(), _: Int)
    higherOrderFunction(1, f)
  }
}
