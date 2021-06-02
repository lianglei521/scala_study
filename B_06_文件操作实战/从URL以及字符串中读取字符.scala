package B_06_文件操作实战

import scala.io.Source

object 从URL以及字符串中读取字符 {
  def main(args: Array[String]): Unit = {
  //val source = Source.fromURL("http://www.baidu.com", "UTF-8")
  val source = Source.fromString("Hello World")
  val lines= source.getLines().toArray
  for ( line <- lines ) {
    println(line)
  }
  source.close()
  }
}
