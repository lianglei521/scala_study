package A_02_面向对象编程之类

class Student6 {
  private var name = ""
  private var age = 0
  //scala中可以定义多个辅助构造器的，类似于java中的构造函数重载，辅助构造器之间可以互相调用
  //而且必须第一行调用柱构造器
  //辅助构造器this，注意和主构造器的区别
  def this(name:String){
    this()//这个应该就是主构造器
    this.name = name
  }
  def this(name:String,age:Int){
    this(name)
    this.age = age
  }

  def message = {
    print(name+"的年龄是"+age+"岁")
  }
}

object student{
  def main(args: Array[String]): Unit = {
    val s = new Student6("lucy",28)
    s.message
  }
}
