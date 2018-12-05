package com.skysoftatm

class Visibility {
  // Public
  def foo() = {}

  // Only accessible from sub-classes
  protected def fooButProtected() = {}

  // Only accessible from the current class
  private def fooButPrivate() = {}

  // Private only outside of com.skysoftatm package
  private[skysoftatm] def bar() = {}
}
