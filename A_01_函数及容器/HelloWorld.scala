package A_01_函数及容器

class HelloWorld {
  //定义一个类的私有属性---和java的定义一样---注意var修饰的变量，scala生成面向JVM的类时，自动会提供setter和getter的方法，
  // 并且变量前面用private修饰了，则生成的setter和getter的方法也是带有private
  //如果是val修饰的变量，则只提供getter的方法
  //重点----------如果不希望生成setter和getter的方法时，则将field声明为private[this]
  private var name = "leo"
  //定义一个带有括号的无参的方法，调用的时候，可带可不带括号
  def sayHello(){println("hello"+name)}
  //定义一个不带括号的方法，调用的时候，不能带有括号
  def getName = name
}

object HelloWorld{
  def main(args: Array[String]): Unit = {
    val helloWorld = new HelloWorld
    helloWorld.sayHello()
    print(helloWorld.getName)
  }
}
