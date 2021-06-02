package A_08_模式匹配

object 模式匹配中变量赋值 extends App{
  def judgeGrade(name:String,grade:String): Unit ={
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("just so so")
      case _grade if name == "leo" => println(name+":"+_grade)
      case _grade  => println(_grade)
    }
  }

  judgeGrade("lucy","D")

}
