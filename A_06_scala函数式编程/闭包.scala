package A_06_scala函数式编程

object 闭包 extends App{
  //函数在变量不处于有效作用域时，还能够对其进行访问的就叫做闭包-------如下面的msg变量的使用
  def greetFunc(msg:String)=(name:String)=>println(msg+":"+name)


}
