package A_08_模式匹配

object 基础语法 extends App{
  def judgeGrade(grade:String){
    grade match {
      case "A" => println("excellent")
      case "B" => println("good")
      case "C" => println("just so so")
      case  _   => println("you need work harder")
    }
  }
  judgeGrade("D")
}
