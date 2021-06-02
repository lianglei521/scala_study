package A_04_面向对象编程之继承

//定义一个抽象的类
abstract class Person7(val name:String) {

//定义一个抽象field------默认是没有getter和setter的方法的
val age:Int

//只要类中有一个抽象方法就是抽象类，必须使用关键字abstract,并且抽象方法没有方法体
def sayHello:Unit
}


class Student7(name:String) extends  Person7(name){

  //子类必须覆盖父类抽象的field并给初始值-------会有getter和setter的方法
  val age: Int = 18

  //这个是实现，而不是重写
  def sayHello: Unit = print(name)
}