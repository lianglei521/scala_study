package A_06_scala函数式编程

object scala中的常用高阶函数 extends App {

 val arr = Array(1,2,3,4,5,6)

  //高阶函数map的使用
  val arr2 = arr.map(_*2)//这个操作是生成了一个新的数组
  //println(arr2.toList)

  //高阶函数foreach的使用
  //arr.foreach(println(_))


  //高阶函数filter的使用
  //arr.filter(_%2 == 0).map(_*2).foreach(print(_))


  //高阶函数reduceleft的使用
  val sum = arr.reduceLeft(_+_)
  //println(sum)


  //高阶函数sortWith的使用
  arr.sortWith(_>_).foreach(print(_))


}
