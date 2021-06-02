package A_03_面向对象编程之对象

//让object继承抽象的类，重写里面的方法

//定义抽象的类----带有参数的柱构造器---注意里面的变量一定加var/val修饰------否则外面访问不到
abstract class Hello (var message:String){
  //定义抽象的方法
  def sayHello(name:String):Unit
}

//定义一个对象继承上面的抽象类----注意构造器里传递的实参的作用
object HelloImpl extends Hello("hello"){
  override def sayHello(name: String) = {
    println(message + "," + name )
  }


  def main(args: Array[String]): Unit = {
    //注意与上一节中，使用new关键字的区别，来构造一个实例,其实本来就是个实例直接拿过来用即可--------体会一下
    val v = HelloImpl
    v.sayHello("lucy")
  }
}
