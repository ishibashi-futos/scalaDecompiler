package com.github.fishibashi.scaladecompile

abstract class BaseMixinSample(val prefix: String, val suffix: String) {
  def greet(name: String): Unit = println(prefix + name + suffix)
}

trait TraitA {
  val a: String
  def A(): Unit = println("A")
}

trait TraitB {
  val b: String
  def B(): Unit = println("B")
}

class DefaultMixinSample() extends BaseMixinSample("Hello", "!") with TraitA with TraitB {
  override def greet(name: String): Unit = super.greet(name)

  override val a: String = "Value is A"
  override val b: String = "Value is B"
}

object DefaultMixinSample {
  def test(): Unit = {
    val sample = new DefaultMixinSample
    sample.greet("Scala")
    sample.A()
    sample.B()
  }
}