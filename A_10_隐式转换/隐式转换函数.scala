package A_10_隐式转换

object 隐式转换函数 extends App{
  var ticketNumber = 0
  def buySpecialTicket(p: SpecialPerson):String={
    ticketNumber += 1
    "T-" + ticketNumber
  }


  val student: Student = new Student("leo")

  implicit def object2SpecialPerson(obj: Object): SpecialPerson = {
    if (obj.getClass == classOf[Student]) {
      val stu = obj.asInstanceOf[Student];
      new SpecialPerson(stu.name)
    }
    else if (obj.getClass == classOf[Older]) {
      val old = obj.asInstanceOf[Older];
      new SpecialPerson(old.name)
    }
    else null
  }
//注意下面这个方法用到了隐式转换，那么他的上面要紧跟导入隐式转换，否则放到其他位置不起作用
  println(buySpecialTicket(student))

}
