package A_02_面向对象编程之类

class Student2 {
  private var myName = "leo"
  //自定义setter和getter方法
  //getter方法
  def name = myName
  //setter方法-----注意这个方法中的=两边不能有空格，并且右边拼接下划线(get和set的变量名必须是一致的)
  def name_=(newValue:String){
    myName = newValue
    println("you cannot edit name!!! ")
  }
}

object Student2{
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "lucy"//调用的是setter方法----也就是上面的name_方法
    println(student2.name)//调用的是getter方法-----也就是上面的name方面
  }
}
