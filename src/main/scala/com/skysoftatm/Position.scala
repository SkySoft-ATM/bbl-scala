package com.skysoftatm

case class Position(x: Double, y: Double, alt: Double) {
  def example() = {
    // No new keyword
    val position = Position(1.0, 2.0, 100.0)

    // A case class is immutable

    // Comparison is done by value
    if (position == Position(1.0, 2.0, 100.0)) {
      // True
    }

    // Comparison with regular classes is done by reference
  }
}