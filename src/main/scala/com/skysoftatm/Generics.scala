package skysoftatm

class Generics[A] {
  def foo(foo: A): A = {
    return foo
  }

  def bar() = {
    val v = new Generics[Int]
    v.foo(5)
  }
}