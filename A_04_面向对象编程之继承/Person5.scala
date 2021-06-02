package A_04_面向对象编程之继承

class Person5 (val name:String,val age:Int)

//一个类中有一个主构造器和多个辅助构造器

//只能在子类的主构造中调用父类构造器，如果父类接收了参数，那么子类接受参数时就不能用var/val修饰
// 否则会认为是子类覆盖父类的field
class Student5(name:String,age:Int,val score:Double) extends Person5(name,age){
    //辅助构造器
    def this(name:String){
      //必须调用主构造器或其他辅助构造器----所以调不来父类的构造器
      this(name,0,0)
    }

    def this(age:Int){
      //必须调用主构造器或其他辅助构造器
      this("leo",age,88)
  }
}
