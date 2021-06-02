package B_07_偏函数

object 偏函数练习 {
  //简单来说，偏函数是什么，其实就是没有定义好明确的输入参数的函数，函数体就是一连串的case语句
  //偏函数是PartialFunction[A, B]类的一个实例
  // 这个类有两个方法，一个是apply()方法，直接调用可以通过函数体内的case进行匹配，返回结果;
  //另一个是isDefinedAt()方法，可以返回一个输入，是否跟任何一个case语句匹配

  //偏函数用法（Partial Function Application）是指创建一个调用别的一个项目组参数已经预置的函数的函数的用法。
  val getStuGrade:PartialFunction[String,Int] = {
    case "leo" => 80;
    case "tom" => 90;
    case "lucy" => 100

    //case "Leo" => 90;
    //case "Jack" => 85;
    //case "Marry" => 95

  }

  /*val getStuGrade: PartialFunction[String, Int] = {
    case "Leo" => 90;
    case "Jack" => 85;
    case "Marry" => 95
  }*/

  def main(args: Array[String]): Unit = {
    //如果没有匹配上就报错
    val i: Int = getStuGrade("leo")
    println(i)
    println(getStuGrade.isDefinedAt("Tom"))
    println(getStuGrade.isDefinedAt("Tom"))
  }
}
