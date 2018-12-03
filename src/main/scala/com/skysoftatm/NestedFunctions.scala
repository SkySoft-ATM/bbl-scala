package com.skysoftatm

object NestedFunctions {
  // mergesortHelper is only used in the context of mergesort
  def mergesort(array: Array[Int]): Unit = {
    val helper = new Array[Int](array.length)
    mergesortHelper(array, helper, 0, array.length - 1)
  }

  private def mergesortHelper(array: Array[Int], helper: Array[Int], low: Int, high: Int): Unit = {
    if (low < high) {
      val middle = (low + high) / 2
      mergesortHelper(array, helper, low, middle)
      mergesortHelper(array, helper, middle + 1, high)
      Utils.merge(array, helper, low, middle, high)
    }
  }

  // Solution: embed mergesortHelper
  // mergesortHelper is only used in the context of mergesort
  def mergesort1(array: Array[Int]): Unit = {
    val helper = new Array[Int](array.length)
    mergesort2(array, helper, 0, array.length - 1)

    def mergesort2(array: Array[Int], helper: Array[Int], low: Int, high: Int): Unit = {
      if (low < high) {
        val middle = (low + high) / 2
        mergesort2(array, helper, low, middle)
        mergesort2(array, helper, middle + 1, high)
        Utils.merge(array, helper, low, middle, high)
      }
    }
  }
}
