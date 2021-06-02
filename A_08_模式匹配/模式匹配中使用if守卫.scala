package A_08_模式匹配

object 模式匹配中使用if守卫 extends App {
  def judgeGrade(name:String,grade:String): Unit ={
    grade match {
      case "A" => println("excellent")
      case "B" => println("good")
      case "C" => println("just so so")
      case _ if name == "leo" => println("不错啦") //带守卫的
      case _ => println("you need study up")
    }
  }

  judgeGrade("lucy","C")
  judgeGrade("leo","D")
}
