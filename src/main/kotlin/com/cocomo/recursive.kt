package com.cocomo

fun fibonacci(n: Int): Int {
    tailrec fun go(n: Int, a: Int, b: Int): Int =
        if (n == 0) a
        else go(n - 1, b, a + b)
    return go(n, 0, 1)
}