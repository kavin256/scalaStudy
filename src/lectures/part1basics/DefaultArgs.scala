package lectures.part1basics

/**
 * @author: Kavin Ranawella
 * @Date: 2021-11-13
 */
object DefaultArgs extends App {

  def trFactorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFactorial(n - 1, n * acc)

  val fac10 = trFactorial(10)

  println(fac10)

  def savePic(format: String = "jpeg", width: Int = 800, height: Int = 600): Unit = println("saving a picture with: " + format + " with " + width + " x " + height)

  savePic("jpeg", 800, 600)
//  savePic((), 800, 600)
  savePic(width = 1800)
}
