package lectures.part2oop

/**
 * @author: Kavin Ranawella
 * @Date: 2021-12-13
 */
object OOBasics extends App {
  val person = new Person("John", 25)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

// constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2 // field
  println(1 + 3)

  // method
  // here, the important thing is that even though the name is not a field
  // But it is still available withing the class definition
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")
}

// class parameters are not fields