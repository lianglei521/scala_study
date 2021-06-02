package B_02_多维数组_scala与java数组的隐式转换

object Java数组和Scala数组的转化 {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConversions.bufferAsJavaList
    import scala.collection.mutable.ArrayBuffer

    val command = ArrayBuffer("javac", "C:\\Users\\Administrator\\Desktop\\HelloWord.java")
    val processBuilder = new ProcessBuilder(command)
    val process = processBuilder.start()
    val res = process.waitFor()
    print(res)

    /*import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable.Buffer

    val cmd: Buffer[String] = processBuilder.command()*/

  }
}
