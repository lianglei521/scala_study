package A_07_函数式编程之集合操作

import scala.io.Source.fromFile
object 统计多个文本的单词计数 extends App {
  //读取文件的内容---再转换为字符串
  val lines1 = fromFile("./src/a.txt").mkString//这行的字符串可是一整篇的内容
  val lines2 = fromFile("./src/b.txt").mkString
  //把字符串放到list集合中
  val list = List(lines1,lines2)
  val strList: List[String] = list.flatMap(_.trim().split(" "))
  val tpList: List[(String, Int)] = strList.map((_,1))
  val stringToTuples: Map[String, List[(String, Int)]] = tpList.groupBy(_._1)
  val stringToInts: Map[String, List[Int]] = stringToTuples.mapValues(tl => {tl.map(_._2)})
  val stringToInt: Map[String, Int] = stringToInts.mapValues(ll => {ll.reduceLeft(_+_)})
  stringToInt.foreach(println)

}
