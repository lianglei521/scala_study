package A_09_类型参数

object 下边界Bounds extends App {

  def getChild[T>:Child](person:T): Unit ={
    if(person.getClass == classOf[Child]) println("please tell us your father's name")
    else if(person.getClass == classOf[Father]) println("sign your name for your child's id card")
    else println("sorry, you are not allowed to get id card.")
  }
  getChild(new Child("lucy"))
  getChild(new Father("tom"))
}

class Father(val name:String)

class Child(name:String)extends Father(name)
