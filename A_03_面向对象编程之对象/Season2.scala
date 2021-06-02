package A_03_面向对象编程之对象

object Season2 extends Enumeration {
//可以通过value传递枚举值的id和name------可以通过id和toString获取枚举值----也可以通过id和name来获取
  val SPRING = Value(0,"spring")
  val SUMMER = Value(1,"summer")
  val AUTUMN = Value(2,"autumn")
  val WINTER = Value(3,"winter")


  def main(args: Array[String]): Unit = {
    //方式一获取
    val s1 = Season2(0)
    //方式二获取
    val s2 = Season2.withName("summer")
    println(s1+"----"+s2)

    //使用枚举Object.values遍历枚举值----就是value中的name
    for(ele <- Season2.values) println(ele)

  }

}
