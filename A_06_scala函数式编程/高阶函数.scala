package A_06_scala函数式编程

object 高阶函数 extends  App {

  //高阶函数就是函数的返回值是函数，或者是函数接收的参数也是函数

  //功能一：
  //定义一个匿名函数赋值给变量
  def sayHelloFun = (name:String) => {println(name)}

  //定义一个接收函数参数的函数-----注意参数函数里的参数只写了个类型
  def greeting(func:(String) => Unit,name:String){func(name)}

  greeting(sayHelloFun,"hello")



  //对数组进行map操作---map里面传递函数表示对数组里的每个元素进行操作
  val arr = Array(1,2,3,4,5,6).map((num:Int)=>num*2)
  println(arr.toList)


  //功能二：
  //高阶函数的另一个功能就是将函数作为返回值----把这个函数再赋值给一个变量---注意由于返回的函数需要参数故调用变量时需要传递参数
  def getgreetFunc(name:String) = (msg:String)=>{println(msg+":"+name)}
  val greetFunc = getgreetFunc("leo")
  greetFunc("hello")


}
