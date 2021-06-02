package A_06_scala函数式编程


object 函数赋给变量 extends App {

  def  sayHello(name:String){println(name)}

  //将定义好的函数赋值给变量------格式----函数名+空格+下划线
  val sayHelloFun = sayHello _

  sayHelloFun("二毛驴")


}
