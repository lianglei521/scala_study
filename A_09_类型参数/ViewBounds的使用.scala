package A_09_类型参数

import A_09_类型参数.ViewBounds的使用.dog


class PersonP(val name: String) {
  def sayHello = println("Hello, I'm " + name)
  def makeFriends(p: PersonP) {
    sayHello
    p.sayHello
  }
}
class StudentS(name: String) extends PersonP(name)
class Dog(val name: String) {
  def sayHello = println("Wang, Wang, I'm " + name)

}

class Party[T <% PersonP](p1: T, p2: T){

 def play = {p1.makeFriends(p2)}
}
object ViewBounds的使用 extends App {


  val dog = new Dog("wangcai")
  val p = new StudentS("lucy")

  implicit def dog2person(obj: Object):PersonP ={
    if(dog.isInstanceOf[Dog]) {val _dog = dog.asInstanceOf[Dog]; new PersonP(_dog.name) } else null}

  val party = new Party(p,dog)



}
