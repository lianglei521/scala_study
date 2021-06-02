package A_03_面向对象编程之对象

//半生类和半生对象的使用，--------必须定义在一个.scala文件中
//半生类和半生对象的使用，--------两者可以相互访问对方的私有成员

//定义半生类
class Person2(name:String,age:Int) {
  def sayHello = {
    println("Hi "+ name +"I guess you are "+ age + "years old!!! and usually you must have "+ Person2.eyeNum +" eyes")
  }
}
//定义半生对象
object Person2{
  //构造代码,必须赋值
  private val eyeNum = 2

  //getter方法
  def getEyeNum = eyeNum

  //main方法是程序的入口，必须有-------注意它只能放在object中使用-------放在class中不可以
  def main(args: Array[String]): Unit = {
    //这行如果不使用new 关键字就不能调用sayHello,因为class中的方法不是静态的，object中的方法是静态的
    //在object中而不在方法中的代码是构造方法中的代码，而且object不能定义接受参数的construct
    val p = new Person2("lucy",28)
    p.sayHello
  }

}

