package A_08_模式匹配

class Person
case class Teacher(name:String,subject:String) extends Person
case class Student(name:String,classroom:String) extends Person

object caseclass与模式匹配 extends App{
  def judgeIdentify(p:Person): Unit ={
    p match {
      case Teacher(name,subject) => println(name+":"+subject)
      case Student(name,classroom) => println(name+":"+classroom)
      case _ => print("please go out school")
    }
  }

  judgeIdentify(Teacher("lucy","English"))
}


