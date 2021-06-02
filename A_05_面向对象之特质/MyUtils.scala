package A_05_面向对象之特质

//trait继承类-----类再继承这个trait

class MyUtils {
  def printMessage(msg:String)=println(msg)
}

trait Logger9 extends MyUtils{
  def log(msg:String) = printMessage("log:"+msg)
}

class Person9 (val name:String)extends Logger9{
  def sayHello: Unit ={
    log("日志信息")
    printMessage("打印名字:"+name)
  }
}

object Test9 extends App{
  val p = new Person9("lucy")
  p.sayHello
}




