package B_09_提取器

object 样例类的提取器实战 extends App{
  //此处调用了apply方法
  val stu = Student("leo",18)
  stu match{
      //此处调用了unapply方法
    case Student(name,score) => println(name+":"+score)
    case _ => println("没有匹配到")
  }
}

//样例类默认实现了apply方法和unapply
case class Student(name:String,score:Double)
