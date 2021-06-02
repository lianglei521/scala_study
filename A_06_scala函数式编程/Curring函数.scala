package A_06_scala函数式编程

object Curring函数 extends App {

  //柯里化函数---就是将原来接收两个参数的一个函数转换为，
  // 第一个函数接受原先的第一个参数，返回接收原先第二个参数的第二个函数

  //最初的形式
  def sum(a:Int,b:Int) = a+b

  //演变的过程
  def sum2(a:Int) = (b:Int) => a+b


  //最终的形式
  def sum3(a:Int)(b:Int) = a+b

  val result = sum3(1)(2)
  print(result)

}
