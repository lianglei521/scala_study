package A_05_面向对象之特质

//trait调用连

//一个类混入多个特质，依次调用多个trait中的同一个方法，只要让多个trait的方法中调用super即可
//调用的时候会从右边开始往左依次调用，其实就是设计模式中责任链模式的一种具体实现依赖

trait Handler {
  def handle(data:String){}
}

trait DataValidHandler extends Handler{
  override def handle(data: String){
    println("check data " + data)
    super.handle(data)//注意是放在了方法的里面
  }
}

trait SignatureValidHandler extends Handler{
  override def handle(data: String){
    println("check signature "+data)
    super.handle(data)//注意是放在了方法的里面
  }

}

class Person4(val name:String) extends DataValidHandler with SignatureValidHandler{
  def sayHello = {println("hello "+ name);handle(name)}
}

object Test4{
  def main(args: Array[String]): Unit = {
    val p = new Person4("lucy")
    p.sayHello
  }
}
