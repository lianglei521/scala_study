package A_08_模式匹配

object Option与模式匹配 extends App{
  def getGrade(name:String): Unit ={
  val grades = Map("lucy"->"A","tom"->"B","jerry"->"C")
  val grade = grades.get(name)
    grade match {
      case Some(grade) => println(grade)
      case None => println("没有值")
    }
  }

  getGrade("lucy")
  getGrade("liuyi")
}
