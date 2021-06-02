package A_05_面向对象之特质

/**
  *  在trait中，可以混合使用具体方法和抽象方法
  *  可以让具体方法依赖于抽象方法，而抽象方法则放到继承trait的类中去实现
  *  这种trait其实就是设计模式中的模板设计模式的体现
  */

trait Valid {
  //定义抽象方法---具体实现在具体的子类中
  def getName:String
  def valid:Boolean = {
    getName == "leo"
  }
}

class Person5(val name:String ) extends Valid {
  println(valid)
  def getName: String = name
}

object Test5{
  def main(args: Array[String]): Unit = {
    val p = new Person5("lucy")
  }
}
