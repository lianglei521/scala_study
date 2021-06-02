package A_06_scala函数式编程

object Return的使用 extends App{
  //Scala中，不需要使用return来返回函数的值，函数最后一行语句的值，就是函数的返回值。
  //在Scala中，return用于在匿名函数中返回值给包含匿名函数的带名函数，并作为带名函数的返回值。

  def greeting(name:String)={
    def sayHello(name:String):String = {
      return "hello"+name
    }
    sayHello(name)
  }

  val result = greeting("lucy")
  print(result)

}
