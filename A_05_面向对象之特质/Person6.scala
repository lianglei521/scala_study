package A_05_面向对象之特质

/**
  *  在Scala中，trait也是有构造代码的，也就是trait中的，不包含在任何方法中的代码
  *  而继承了trait的类的构造机制如下：1、父类的构造函数执行；2、trait的构造代码执行，
  *  多个trait从左到右依次执行；3、构造trait时会先构造父trait，如果多个trait继承同一个父trait，
  *  则父trait只会构造一次；4、所有trait构造完毕之后，子类的构造函数执行
  */

class Person6 {
  println("person6's constructor")
}
trait Logged6{
  println("logged6's constructor")
}

trait Mylogger6 extends Logged6{
  println("mylogger6's cnstructor")
}

trait TimeLogger6 extends Logged6{
  println("timeLogger6's constructor")
}

class Student6 extends Person6 with Mylogger6 with TimeLogger6{
  println("student6's constructor")
}

object Test6{
  def main(args: Array[String]): Unit = {
    val s = new Student6
  }
}
