package com.github.fishibashi.scaladecompile

trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends Greeter

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}
