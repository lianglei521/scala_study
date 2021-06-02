package B_04_扩大内部类作用域的2种方法_内部类获取外部类引用

object 内部类获取外部类的引用 {
  def main(args: Array[String]): Unit = {

    val c1 = new Class3("c1")
    val leo = c1.register("leo")
    println(leo.introduceMyself)

  }
}
//内部类想引用外部类的属性----如下面的outer引用
class Class3(val name: String) { outer =>
  class Student(val name: String) {
    def introduceMyself = "Hello, I'm " + name + ", I'm very happy to join class " + outer.name
  }
  def register(name: String) =  {
    new Student(name)
  }
}

