package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object Recursions extends App {
  def factorial(number: Int): Int = {
    if (number == 1) 1
    else {
      println("Computing factorial of " + number + " - I need factorial of " + (number - 1));
      var result = number * factorial(number - 1)
      println("Computed factorial of " + number);

      result
    }
  }

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // tail recursion = use recursive call as the LAST expression

    factHelper(n, 1)
  }


  println(anotherFactorial(5000))


  // when u need loops, use tail recursion

  @tailrec
  def repeatedFunction(aStrinf: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else repeatedFunction(aStrinf, n - 1, aStrinf + accumulator)
  }

  println(repeatedFunction("hello", 3, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(37))
  println(isPrime(2002))
  println(isPrime(2003))
  println(isPrime(37 * 17))

  def fibonacci(number: Int): Int = {
    def fiboTailRec(i: Int, accum2: Int, accum1: Int): Int =
      if (i >= number) accum2
      else fiboTailRec(i + 1, accum2 + accum1, accum2)

    if (number <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

//  last = accum2
//  nexttolast = accum1

  println(fibonacci(8))

}
