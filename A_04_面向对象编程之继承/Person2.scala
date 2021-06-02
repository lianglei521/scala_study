package A_04_面向对象编程之继承

class Person2 {
  val name = ""
  def sayHello = {println("hello")}
}

class Student2 extends Person2{
  val age = 28
  def study(subject:String) = {println("study "+ subject)}
}

object Test2{
  def main(args: Array[String]): Unit = {
    val p:Person2 = new Student2
    //isInstanceOf不能精准的判断，像下面[]里写person也是满足条件
    if(p.isInstanceOf[Student]) p.asInstanceOf[Student]


    //精准判断-----getClass-----classOf[]
    println(p.getClass == classOf[Person2]) //false
    println(p.getClass == classOf[Student2]) //true
  }
}