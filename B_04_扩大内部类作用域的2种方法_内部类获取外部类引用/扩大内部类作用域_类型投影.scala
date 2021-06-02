package B_04_扩大内部类作用域的2种方法_内部类获取外部类引用

import scala.collection.mutable.ArrayBuffer

object 扩大内部类作用域_类型投影 {
  def main(args: Array[String]): Unit = {
    val c1 = new Class
    val leo = c1.register("leo")
    c1.students += leo

    val c2 = new Class
    val jack = c2.register("jack")
    c1.students += jack
  }
}

class Class {
  class Student(val name: String)
  //注意外部类#内部类------就可扩大内部类的范围
  val students = new ArrayBuffer[Class#Student]
  def register(name: String) =  {
    new Student(name)
  }
}


