package B_06_文件操作实战

import java.io.File

object 递归遍历子目录 {
  def getSubdirIterator(dir: File): Iterator[File] = {
    val childDirs = dir.listFiles.filter(_.isDirectory)
    childDirs.toIterator ++ childDirs.toIterator.flatMap(getSubdirIterator _)
  }

  def main(args: Array[String]): Unit = {
    val iterator = getSubdirIterator(new File("C://Users//Administrator//Desktop"))
    for(d <- iterator) println(d)
  }
}
