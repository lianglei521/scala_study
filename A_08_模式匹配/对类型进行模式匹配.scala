package A_08_模式匹配

object 对类型进行模式匹配 extends App{
  def processException(e:Exception): Unit ={
    e match{
      case e1:IllegalArgumentException => print(new IllegalArgumentException("参数不合法"))
      case e2:NullPointerException     => print(new NullPointerException("空指针异常"))
    }
  }

  processException(new IllegalArgumentException("haha"))

}
