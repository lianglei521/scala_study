package B_06_文件操作实战

import java.io._

object 文件拷贝 {
  def main(args: Array[String]): Unit = {
   /* val fir = new FileInputStream(new File("F:\\workspace\\src\\a.txt"))
    val fow = new FileOutputStream(new File("F:\\workspace\\src\\c.txt"))
    val buf = new Array[Byte](1024)
    val len = fir.read(buf)
    //scala是这种读取方式，一次性读取
    fow.write(buf,0,len)
    fir.close
    fow.close()*/

    val pw = new PrintWriter("F:\\workspace\\src\\d.txt")
    pw.println("Hello World")
    pw.close()
  }
}
