package A_03_面向对象编程之对象

//object 就是class的一个实例，也是单例，class中静态的方法或者字段都放在object里，
// 在object中而不在方法中的代码是构造方法construct的代码，调用object时会走这些代码
//object不能定义接受参数的construct
object Person {
  //构造代码,必须赋值
  private val eyeNum = 2

  println("this is person object ")
  def getEyeNum = eyeNum


  def main(args: Array[String]): Unit = {
    //因为是对象，所以可以直接对象名调用
    val num = Person.getEyeNum
    println(num)
  }
}