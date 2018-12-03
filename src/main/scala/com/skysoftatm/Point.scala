package com.skysoftatm

// Default (Int, Int) constructor
class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy

    println(s"$x $y")
  }

  def example() = {
    // Similar than in Java
    val point = new Point(5, 2)
    point.move(1, 1)
    point.x = 5
  }
}