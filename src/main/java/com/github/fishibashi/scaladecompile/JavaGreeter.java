package com.github.fishibashi.scaladecompile;

import scala.Predef$;

public class JavaGreeter {
    private final String prefix;

    private final String suffix;

    public JavaGreeter(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String greet(String name) {
        return prefix + name + suffix;
    }
}
