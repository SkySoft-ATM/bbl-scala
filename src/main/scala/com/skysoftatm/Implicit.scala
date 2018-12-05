package com.skysoftatm

class Implicit {
  implicit def barToFoo(bar: Bar): Foo = new Foo(bar.y + bar.z)

  case class Foo(x: Int)

  case class Bar(y: Int, z: Int)

  object Consumer {
    def consume(foo: Foo): Unit = {
      println(foo.x)
    }
  }

  object Test {
    def test() = {
      val bar = new Bar(5, 2)
      // consume() call using a Bar?
      Consumer.consume(bar)
    }
  }

}
