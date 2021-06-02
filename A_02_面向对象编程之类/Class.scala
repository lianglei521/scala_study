package A_02_面向对象编程之类

import scala.collection.mutable.ArrayBuffer
//内部类的使用，定义在类的内部，与java不同的是，每个外部类对象的内部类是不同的类
class Class {
  //内部类---使用的主构造器
  class Student(val name:String){}

  //定义一个容器，来存放学生对象
  val students = new ArrayBuffer[Student]()

  //定义一个获取内部类对象的方法
  def getStudent(name:String) ={
    new Student(name)
  }

}

object Class{
  def main(args: Array[String]): Unit = {
    val c1 = new Class
    val s1 = c1.getStudent("lucy")
    c1.students += s1

    val c2 = new Class
    val s2 =c2.getStudent("tom")
    //c1.students += s2  //编译报错
    c2.students += s2    //编译正常
  }
}
