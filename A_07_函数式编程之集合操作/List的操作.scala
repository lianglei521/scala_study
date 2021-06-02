package A_07_函数式编程之集合操作

object List的操作 extends App{
  //List-----不可变------调用apply()来构造
  val list = List(1,2,3,4,5)
  //打印头元素
  println(list.head)
  //打印尾列表
  println(list.tail)

  //::的使用------生成一个新的list
  val list2 = 0::list
  println(list2)


  //案例：用递归函数来给List中每个元素都加上指定前缀，并打印加上前缀的元素-------Nil的使用
  def decorate(ls:List[Int],prefix:String): Unit ={
    if(ls!=Nil){
      println(ls.head)
      decorate(ls.tail,prefix)
    }
  }


}
