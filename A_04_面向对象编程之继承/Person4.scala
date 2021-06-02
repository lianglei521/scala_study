package A_04_面向对象编程之继承

class Person4 {
  //protected修饰的字段可以在子类中访问
  protected  val name = "leo"
  //protected[this]修饰的字段在子类中只能被当前的实例访问
  protected [this] val age = 28
}

class Student4 extends  Person4{
  def sayHello = println(name)
  def mkFriend(s:Student4)= {
    //println(age == s.age) //s这个实例访问不到age
  }
}

object Test1{
  def main(args: Array[String]): Unit = {
    val s = new Student4
    println(s.sayHello)
  }
}

