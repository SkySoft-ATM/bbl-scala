package com.skysoftatm

import scala.collection.immutable

object Loop {
  def main(args: Array[String]): Unit = {
    // Include
    for (a <- 0 to 10) {
      println(a)
    }

    // Exclude
    for (a <- 0 until 10) {
      println(a)
    }

    // Combination
    for (a <- 0 until 2; b <- 0 to 2) {}
    /*
      a=0, b=0
      a=0, b=1
      a=0, b=2
      a=1, b=0
      a=1, b=1
      a=1, b=2
     */

    // Iteration
    val list = List(5, 7, 3, 0, 10, 6, 1)
    for (elem <- list if elem % 2 == 0) {}

    // for comprehenssion: for() yield element
    val sub: immutable.Seq[Int] = for (elem <- list if elem % 2 == 0) yield elem
  }
}
