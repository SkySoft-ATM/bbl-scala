package com.skysoftatm

object Mapx {
  def main(args: Array[String]): Unit = {
    // Map initialization
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

    // Association operator ->

    // Default Map is immutable
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = colors1 + ("blue" -> "#0033FF")

    // Mutable map structure
    val states = scala.collection.mutable.Map("AL" -> "Alabama", "AK" -> "tobedefined")
    states("AK") = "Alaska"
  }
}
