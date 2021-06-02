package A_03_面向对象编程之对象

//App这个trait的原理----App Trait继承自Delayedlnit Trait 当scalac进行编译时，会把继承App Trait 的object的constructor的
//代码放到Delayedlnit Trait 的delayedlnit的方法中执行


object Person4 extends App {
  //还可以通过ags来接受参数
  if(args.length > 0) println("打印参数"+args(0))
  else println("我不用main方法都可以运行。。。。。")
}
