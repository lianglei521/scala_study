package A_04_面向对象编程之继承

class Person {
  private val name = "leo"
  val age = 28
  def getName = name
}

class Student extends  Person{
  private val score = "A"
  def getScore = score

  //可以重写父类非私有的字段
  override val age = 30

  //可以重写父类非私有的方法----子类中非要调用父类中被覆盖的方法，用super关键字
  override def getName: String = super.getName
}

object Test{
  def main(args: Array[String]): Unit = {
    val s = new Student
    println(s.getName + "是"+s.age +  "得了"+ s.getScore+"分")

  }
}