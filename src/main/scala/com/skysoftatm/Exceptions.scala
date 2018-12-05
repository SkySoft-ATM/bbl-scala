package com.skysoftatm

import java.io.FileReader

import scala.util.{Failure, Success, Try}

object Exceptions {
  def main(args: Array[String]): Unit = {
    // Java way
    try {
      val n = new FileReader("input.txt").read()
      println(s"Success: $n")
    } catch {
      case e: Exception =>
        e.printStackTrace
    }

    // Scala way
    // Try: container for success or failure
    val tried: Try[Int] = Try(new FileReader("README.md"))
      .map(f => f.read())

    tried match {
      case Success(n) => println(s"Success: $n")
      case Failure(e) => e.printStackTrace
    }
  }
}
