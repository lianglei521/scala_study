package B_06_文件操作实战

import scala.io.{BufferedSource, Source}

object 文件操作 {
  def main(args: Array[String]): Unit = {
    //方法一
    //从文件中获取资源对象
    /*val file: BufferedSource = Source.fromFile("F:\\workspace\\src\\a.txt", "UTF-8")
    //从资源文件中获取每一行，返回一个迭代器,不过BufferedSource的getLines方法只能调用一次
    val lines: Iterator[String] = file.getLines()
    for (line <- lines ) {
      println(line)
    }
    file.close()
    */

    //方法二: 将Source.getLines返回的迭代器，转换成数组
   /* val file: BufferedSource = Source.fromFile("F:\\workspace\\src\\a.txt", "UTF-8")
    val lines: Array[String] = file.getLines().toArray
    //从资源文件中获取每一行，返回一个迭代器,不过BufferedSource的getLines方法只能调用一次
    for (line <- lines ) {
      println(line)
    }
    file.close()*/

    //方法三: 调用Source.mkString，返回文本中所有的内容
    val file: BufferedSource = Source.fromFile("F:\\workspace\\src\\a.txt", "UTF-8")
    val string: String = file.mkString
    println(string)
    file.close()
  }
}
