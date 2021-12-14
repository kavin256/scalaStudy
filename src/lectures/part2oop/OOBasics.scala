package lectures.part2oop

/**
 * @author: Kavin Ranawella
 * @Date: 2021-12-13
 */
object OOBasics extends App {
  val person = new Person ("John", 25)
  println(person.x)
}
// constructor
class Person (name: String, val age: Int) {
  //body
  val x = 2 // field
  println(1+3)
}

// class parameters are not fields