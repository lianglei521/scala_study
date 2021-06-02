package A_06_scala函数式编程

object 匿名函数赋值变量 extends App {

  //定义匿名函数赋值并赋值给一个变量-----注意匿名函数的定义 =>
  val sayHelloFun = (name:String)=>println(name)

  sayHelloFun("hello")

}
