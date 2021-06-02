package A_08_模式匹配

object 对Array和List进行模式匹配 extends App {
  def greeting(arr:Array[String]): Unit ={
    arr match{
      case Array("tom") => println("hello tom")
      case Array(girl1,girl2,girl3) => println("hello"+girl1+"--"+girl2+"----"+girl3)
      case Array("tom",_*) => println("hello tom and everyone")
      case _ => print("匹配出现错误")
    }
  }
  /*greeting(Array("tom"))
  greeting(Array("tom","lucy"))
  greeting(Array("tom","lucy","jerry"))*/

  def greeting(list:List[String]): Unit ={
    list match{
      case List("leo") => println("leo")
      case List(girl1,girl2,girl3) => println(girl1+"--"+girl2+"---"+girl3)
      case "tom":: Nil => println("tom")
      case "tom":: tail => println("tom****")
      case _ => println("没有匹配到")
    }
  }

  greeting(List("lucy1","lucy2","lucy3"))
  greeting(List("tom"))
  greeting(List("tom","jerry"))
}
