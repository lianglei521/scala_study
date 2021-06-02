package A_07_函数式编程之集合操作

import scala.collection.mutable.HashSet

object Set的使用 extends  App{
  // Set----无序(指的是插入的顺序)-----唯一（不重复）------可变------不可以实例化
  val s = scala.collection.mutable.Set(1,2,3)
  s += 1//这个元素不会插入进去
  println(s)


  // LinkedHashSet会用一个链表维护插入顺序-------可以实例化
  val s2 = new HashSet[Int]()
  s2+=1
  s2+=2
  s2+=3
  println(s2)


  // SrotedSet会自动根据key来进行排序
  val s3 = scala.collection.mutable.SortedSet("orange", "apple", "banana")
  println(s3)


}
