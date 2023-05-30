import scala.io.StdIn

object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    val num: Int = StdIn.readInt()
    for (i <- 1 to 10) {
      val product = num * i
      println(s"$num x $i = $product")
    }
  }
}
