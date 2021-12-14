package lectures.part1basics

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object ValuesVariableTypes extends App {
  val x: Int = 43;
  println(x)
  var aVariable = 3
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  // code block
  val codeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "good bye"
  }

  // val anotherValue = z + 1;

  println(codeBlock)


  // 1. true
  // 2. 42
}
