package A_02_面向对象编程之类

//柱构造器是跟在类后面的的小括号，他不在大括号中
//注意有修饰符，如果没有修饰，类似于name：String 则只能在类中使用相当于private[this]修饰的属性
//如果类中没有使用到，则表示没有该字段
//可以给他一个默认的值（也可以没有，如年龄那个字段）
class Student7(var age:Int,var name:String = "二毛驴"){
  print(name+"---"+age)
}

object Student7{
  def main(args: Array[String]): Unit = {
    val s = new Student7(18)
  }
}
