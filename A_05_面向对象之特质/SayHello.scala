package A_05_面向对象之特质

//类的提前定义的使用

trait SayHello7 {
  val msg:String
  println(msg.toString)
}

 //方式一(类的提前定义)
//class Student7
//
//object Test7{
//  def main(args: Array[String]): Unit = {
//    val s = new {
//      val msg:String = "init"
//    }with Student7 with SayHello7{}
//  }
//
//}


//方式二（类的提前定义）
class Student8 extends {
  val msg:String = "init"
}with SayHello7

object Test8 extends  App{
  val s = new Student8
}
