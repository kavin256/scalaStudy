package lectures.part1basics

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + ' ' + b
  }

  def aParameterlessFunction(): String = "hi"

  println(aFunction("hello", 3))
  println(aParameterlessFunction())


  def repeatedFunction(aStrinf: String, n: Int): String = {
    if (n == 1) aStrinf
    else aStrinf + repeatedFunction(aStrinf, n - 1)
  }

  println(repeatedFunction("hello", 3))
  // WHEN U NEED LOOPS, USE RECURSIONS!!!

  // recursive functions
  // recursive functions need the return type
  def anotherRepeatedFunction(string: String, number: Int): String = {
    def aSmallerfunction(number: Int): Int = number * number

    "goodbye"
    if (number == 1) string
    else {
      "yo" + anotherRepeatedFunction(string, number - 1) + aSmallerfunction(3)
    }
  }

  println(anotherRepeatedFunction("fool", 4))

  def sFunctionWithSideEffects(aString: String): Unit = println(aString)

  sFunctionWithSideEffects("yuuuu")

  def greeting(name: String, age: Int) = "Hi, I'm " + name + " and I'm " + age + " years old"

  println(greeting("Kasun", 30))


  // excercises
  // 01
  def factorial(number: Int): Int = {
    if (number == 1) 1 else {
      number * factorial(number - 1)
    }
  }

  println(factorial(1))
  println(factorial(2))
  println(factorial(3))
  println(factorial(5))

  def fun(number: Int) = number * number

  // 02
  def fibonacci(number: Int): Int = {
    if (number <= 2) 1
    else fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(8))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }




  println(isPrime(37))
  println(isPrime(2002))
  println(isPrime(2003))
  println(isPrime(37*17))

}
