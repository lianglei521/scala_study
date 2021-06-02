package A_10_隐式转换

class Man(val name:String)

class SuperMap(val name:String){
  def emitLaser = println(name +" emit a laser")
}

object 隐式转换加强现有类型 extends App{
implicit  def map2SuperMan(man:Man):SuperMap = new SuperMap(man.name)

  val man = new Man("二毛驴")
  man.emitLaser
}
