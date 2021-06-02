package A_09_类型参数

object 泛型类 extends App{
  val s = new Student[Int](111)
  val id = s.getSchool(222)
  println(id)
}

class Student[T](val localId:T){
  def getSchool(hukouId:T)="S-"+hukouId+localId
}
