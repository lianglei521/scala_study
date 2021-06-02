package B_04_扩大内部类作用域的2种方法_内部类获取外部类引用

import scala.collection.mutable.ArrayBuffer

object 扩大内部类作用域_伴生对象 {
  def main(args: Array[String]): Unit = {
    //如果想让内部类的作用域扩大，就把内部类放到该类的半生对象中
    val c1 = new Class2
    val leo = c1.register("leo")
    c1.students += leo

    val c2 = new Class2
    val jack = c2.register("jack")
    c1.students += jack
  }
}

object Class2 {
  class Student(val name: String)
}

class Class2 {
  val students = new ArrayBuffer[Class2.Student]
  def register(name: String) = {
    new Class2.Student(name)
  }
}

