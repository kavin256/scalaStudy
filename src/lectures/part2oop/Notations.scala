package lectures.part2oop

/**
 * @author: Kavin Ranawella
 * @Date: 2021-12-16
 */
object Notations extends App {
  class Person(val name: String, favMovie: String) {
    def likes(movies: String): Boolean = movies == favMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Incepstion")
  println(mary.likes("Incepstion"))
  println(mary likes "Incepstion") // equivalent
  // infix notation = operator notation (syntactic sugars) resembling natural languages
  // only for single paramater methods


  // "operators" in scala
  val tom = new Person("Tom", "Flight Club")
  println(mary hangOutWith tom)
  println(mary + tom)
  println(mary +(tom))
  println(1.+(2))
  // here the method 'hangOutWith' acts as an operator that takes two and gives out 1 result
  // all operators are methods in scala
}
