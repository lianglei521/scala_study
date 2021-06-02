package A_09_类型参数


//class Person(val name:String){
//  def sayHello = println("hello I am "+name)
//  def mkFriends(p:Person): Unit ={
//    sayHello
//    p.sayHello
//  }
//}
//
//class Student(name:String)extends Person(name)
//
//class Part[T <: Person](p1:T,p2:T){
//  def play = p1.mkFriends(p2)
//}



class Person(val name: String) {
  def sayHello = println("Hello, I'm " + name)
  def makeFriends(p: Person) {
    sayHello
    p.sayHello
  }
}
class StudentP(name: String) extends Person(name)
class Party1[T <: Person](p1: T, p2: T) {
  def play = p1.makeFriends(p2)
}


object 上边界Bounds extends App{
  val s1 = new StudentP("lucy")
  val s2 = new StudentP("tom")
  val p = new Party1(s1,s2)
  p.play
}
