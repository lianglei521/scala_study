package A_02_面向对象编程之类

class Student4 {
  //private[this]修饰的属性只能在当前类中访问，private是当前类中的对象可以访问而其它类中对象不可以访问
  private[this] var myAge = 0
    //定义setter方法
  def age_=(newValue:Int):Unit={
    if (newValue > 0) myAge = newValue
    else print("illegal age")
  }
  //定义getter方法
  def age = myAge

  //定义一个比较年龄的方法
  def olderAge(s:Student4)={
    myAge > s.age
  }

}

//如果是半生对象好多属性都可以访问到，我们这里不用半生对象为的是让一些属性访问不到
object Student4{
  def main(args: Array[String]): Unit = {
    val s1 = new Student4
    val s2 = new Student4
    s1.age_=(35)
    s2.age_=(30)
    val flag = s1.olderAge(s2)
    println(flag)
  }
}
