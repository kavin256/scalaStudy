package lectures.part1basics

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object StringOps extends App {

  val str: String = "Hello, I am learning scala"
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello","Pillow"))

  //s-interpolators
  val name="David"
  val age=12
  val greeting = s"Hello, my name is $name and I'm $age"

  println(greeting)

  //f-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"

  println(myth)


  //raw-interpolators
  val escaped="This is a \n newline"
  println(raw"This is a \n newline")

  println(escaped)
}
