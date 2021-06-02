package B_04_扩大内部类作用域的2种方法_内部类获取外部类引用

import scala.collection.mutable.ArrayBuffer

object 内部类的作用域_外部类对象 {
  def main(args: Array[String]): Unit = {
    //内部类只属于外部类的一个对象，不同的外部类对象的内部类是不同的
    val c1 = new OutClass
    val s1 = c1.register("leo")
    c1.students += s1//注意s1只能加入c1的学生集合中，不能加入c2的学生集合中
    val c2 = new OutClass
    val s2 = c2.register("leo")
    c2.students += s2
  }
}

class OutClass{
  val students = ArrayBuffer[Student]()
  class Student(val name:String)
  def register(name:String)={
      new Student(name)
  }
}
