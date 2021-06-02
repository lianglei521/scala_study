package A_03_面向对象编程之对象

//apply方法的使用

//定义一个类----注意这个类的写法，只有主构造器，后没有大括号------体会这种定义的方式
class Person3 (val name:String)

object Person3 {
  //相当于用apply方法来充当构造器的功能------有点像模式匹配柱构造器的感觉
  def apply(name:String) = new Person3(name)

  //main方法是程序的入口，必须定义在object中，如果不定义的话，可以通过实现App这个trait，提供main方法的入口环境
  def main(args: Array[String]): Unit = {
    //因为上边有apply方法，所以new 对象的时候可以省略掉new,注意下边这种写法
    val p = Person3("lucy")
  }
}

