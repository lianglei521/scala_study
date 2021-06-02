package A_03_面向对象编程之对象

//scala中枚举的使用------继承Enumeration

object Season extends Enumeration {
  //调用Value方法来初始化枚举值
  val SPRING,SUMMER,AUTUMN,WINTER = Value
}
