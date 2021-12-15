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


  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", author, 1861)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter)) // explains equality of objects


  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


}

// constructor
// default parameters are applicable in constructors as well
class Person(name: String, val age: Int = 0) {

  //body
  val x = 2 // field
  println(1 + 3)

  // method
  // here, the important thing is that even though the name is not a field
  // But it is still available withing the class definition
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  // auxiliary constructor. They call the primary constructor
  def this(name: String) = this(name, 0)

  // this is a limitation. the implementation of the auxiliary constructor should be only calling another constructor. Nothing else
  def this() = this("John Doe")
}

// class parameters are not fields


// Exercise
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, author: Writer, year: Int) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, author, newYear)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1) // immutability
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}
