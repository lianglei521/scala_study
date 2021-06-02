package A_04_面向对象编程之继承

//匿名内部类的使用

class Person6(protected val name:String) {

  def sayHello = "hello I am "+ name

  //定义匿名内部类
  val p = new Person6("lucy"){
    override def sayHello: String = "hi I am "+ name
  }

  //把匿名内部类对象传递进去
  def greeting(p:Person6{def sayHello:String}){
    print(p.sayHello)
  }

}

