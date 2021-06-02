package A_05_面向对象之特质

//scala中类似于java中的接口的是特质trait--------特点是里面又抽象方法，也可以有具体方法

//trait中定义抽象的方法
trait HelloTrait {
  def sayHello(name:String)
}

//trait中定义具体的方法
trait Log{
  def log(message:String) = println(message)
}

//定义抽象的方法
trait MakeFriendTrait{
  def makeFriend(p:Person)
}

//trait中的定义具体字段和抽象字段------field可以被混入的对象直接使用了
trait Person2{
  val age:Int = 28
  val msg:String
}

//实现第一个特质用extends,实现第一个以后的特质用with(scala中可以多实现)
class Person(val name:String) extends HelloTrait with MakeFriendTrait with Log with Person2 {

  //抽象的字段必须实现
  val msg:String = "这是log的msg"

  //实现特质中的方法
  def sayHello(name:String) = println("hello "+ name)

  def makeFriend(p: Person) = println("my name is " + name + "and your name is "+p.name)
}
object Test{
  def main(args: Array[String]): Unit = {
    val p = new Person("lucy")
    p.sayHello("tom")
    p.makeFriend(p)
    p.log(p.msg)
    println(p.age)
  }
}
