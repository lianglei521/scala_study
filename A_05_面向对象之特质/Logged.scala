package A_05_面向对象之特质

//有的时候，我们只让某个对象混入特质（动态混入特质），而其他的对象则没有混入特质

//实际这个特质scala中提供了，就是这样定义一个方法，啥也没干
trait Logged {
  def log(msg:String){}
}

//定义一个特质继承Logger
trait MyLogger extends Logged{
  override def log(msg: String): Unit ={
    println(msg)
  }
}

//定义一个类混入特质
class Person3(val name:String) extends  Logged {
  def sayHello = {println("hello　"+ name);log("sayHello("+name+") method is invoked!")}
}

object Test3{
  def main(args: Array[String]): Unit = {
   val p1 = new Person3("lucy")
   val p2 = new Person3("tom")with MyLogger//注意这个对象动态混入特质
   p1.sayHello
   p2.sayHello
  }
}
