package A_04_面向对象编程之继承

class Person3
class Student3 extends  Person3

object Test跳出循环{
  def main(args: Array[String]): Unit = {
    val p:Person3 = new Student3
    //这种匹配也是类似于isInstanceOf,不是很精准
    p match {
      case per:Person3 => println("it is Person3's object")
      case _          => println("unknown type")
    }
  }
}
