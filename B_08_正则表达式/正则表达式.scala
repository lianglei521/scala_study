package B_08_正则表达式

import scala.util.matching.Regex

object 正则表达式 {
  def main(args: Array[String]): Unit = {
    val regex: Regex = "[a-z]+".r
    val str = "hello 123 world 456"
    //for(matchString <- regex.findAllIn(str)) println(matchString)
    //println(regex.findFirstIn(str))
   // val str2 = regex.replaceAllIn(str,"haha")
   // println(str)
   // println(str2)


  }
}
