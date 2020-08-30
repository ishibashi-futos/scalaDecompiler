package com.github.fishibashi.scaladecompile

object IdFactory {
  private var counter = 0
  def create(): Int = {
    counter += 1
    counter
  }
}