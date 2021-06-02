package B_05_重写field的提前定义_Scala的继承层级_对象相等性

object 重写field的提前定义 {
  def main(args: Array[String]): Unit = {
    val stu = new PEStudent()
    print(stu.classScores.toList)
  }
}

class Student {
  val classNumber: Int = 10
  val classScores: Array[Int] = new Array[Int](classNumber)
}

//以下这种继承方式会导致classScores初始化值为空，由于getter方法被重写，返回值为0
/*class PEStudent extends Student{
  override val classNumber: Int = 3
}*/


//field的提前定义-----才能让classScores中的classNumber使用到3
class PEStudent extends {
  override val classNumber: Int = 3
} with Student
