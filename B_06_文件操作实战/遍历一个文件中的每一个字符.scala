package B_06_文件操作实战

import scala.io.{BufferedSource, Source}

object 遍历一个文件中的每一个字符 {
  def main(args: Array[String]): Unit = {
    val file: BufferedSource = Source.fromFile("F:\\workspace\\src\\a.txt", "UTF-8")
    for (c <- file){
      println(c)
    }
    file.close()
  }
}
