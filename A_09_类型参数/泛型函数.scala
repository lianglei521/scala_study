package A_09_类型参数

object 泛型函数 extends App {
  def getCard[T](content:T)={
    if (content.isInstanceOf[Int])"card:001"+content
    else if(content.isInstanceOf[String])"card:this is your card"+content
    else "card:"+content
  }

  println(getCard(555))
  println(getCard("hahaha"))
  println(getCard(List(1,2,3)))
}


