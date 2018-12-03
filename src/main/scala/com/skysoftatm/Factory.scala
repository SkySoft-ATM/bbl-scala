package com.skysoftatm

object Factory {
  def createPoint(x: Int, y: Int): Point = {
    return new Point(x, y)
  }

  // Executable main
  def main(args: Array[String]): Unit = {
    // Static method
    createPoint(1, 2)
  }
}
