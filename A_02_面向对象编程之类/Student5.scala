package A_02_面向对象编程之类

import scala.beans.BeanProperty
class Student5 {
  //通过加注解@Bean Property,可以生成getter，setter,getName,setName的四个方法
  @BeanProperty var name:String = _
}

object Student5{
  def main(args: Array[String]): Unit = {
    val s1 = new Student5
    s1.setName("lucy")
     val name = s1.getName

    s1.name = "tom"
    val name2 = s1.name
    print(name+"----"+name2)
  }
}
