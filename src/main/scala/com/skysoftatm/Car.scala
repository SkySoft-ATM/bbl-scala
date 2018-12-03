package com.skysoftatm

// Interfaces
trait Car {
  def color(): String

  // Default implementation
  def drive(): Point = {
    return new Point(0, 0)
  }
}