package A_02_面向对象编程之类

//定义一个简单的类
class Student {
  //这个变量的赋值不能使用null,否则后面的没法使用再赋值操作--------原因不清楚？
  //不能直接使用null是因为前边没有声明String,单独从null下游用的时候是无法判断具体类型的
  var name:String =null
}

object Student{
  def main(args: Array[String]): Unit = {
    val student = new Student
    //实际调用的是setter方法------就是scala中的的def name_=
    student.name="hello"
    //实际调用的是getter方法------就是scala中的def name=
    print(student.name)
  }
}
