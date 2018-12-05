package com.skysoftatm

object Factory {
  // A factory is a singleton

  // Executable main
  def main(args: Array[String]): Unit = {
    // Static method
    createPoint(1, 2)
  }

  def createPoint(x: Int, y: Int): Point = {
    return new Point(x, y)
  }
}
