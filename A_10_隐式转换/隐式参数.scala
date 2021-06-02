package A_10_隐式转换

class SignPen{
  def write(content:String) = println(content)
}


object 隐式参数 extends App{
  implicit  val signPen = new SignPen
  def signForExam(name:String)(implicit signPen: SignPen): Unit ={
    signPen.write(name+"welcom to eaxam")
  }

  signForExam("leo")

}
