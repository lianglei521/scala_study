package A_02_面向对象编程之类

class Student3 {
  //定义一个私有的属性-----则scala默认提供的setter和getter方法也是私有的
  private var myName = "leo"

  //定义一个方法提供可以更改属性的值
  def updateName(newName:String){
    if("leo1"==newName) myName = newName
    else println("not accept the newName")
  }

  //定义一个对外可以访问的getter方法------相当于把默认私有的gettet方法覆盖了
  def name = myName

}

object Student3{
  def main(args: Array[String]): Unit = {
    val student = new Student3
    student.updateName("leo1")
    println(student.name)
  }
}
