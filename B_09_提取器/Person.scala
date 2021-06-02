package B_09_提取器


class Person(val name:String,val age:Int)

object Person{
  def appay(name:String,age:Int)= new Person(name,age)

  def unapply(str:String) = {
    val splitIndex = str.indexOf(" ")
    if (splitIndex == -1) None
    else Some((str.substring(0,splitIndex),str.substring(splitIndex+1)))
  }
}