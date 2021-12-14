package lectures.part1basics

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object CBVVsCBN extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = { // => symbol delays the evaluation until it is used
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
