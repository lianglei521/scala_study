package A_06_scala函数式编程

object 高阶函数的类型推断 extends App {

  def greeting(fun:(String) => Unit,name:String)={fun(name)}

  //对于只有一个参数的函数在调用时可以省略类型
  greeting((name) => println(name),"leo")

  //对于只有一个参数的函数在调用时不仅可以省略类型还可以省略小括号
  greeting(name => println(name),"Tom")


  //如果仅有的一个参数在右侧的函数体内只使用一次，则还可以将接收参数省略，并且将参数用_来替代
  def triple(func:(Int) => Int) = {func(3)}

  val result = triple(3 * _)
  println(result)

}
