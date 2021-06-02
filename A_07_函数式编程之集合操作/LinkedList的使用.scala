package A_07_函数式编程之集合操作

import java.security.KeyStore.TrustedCertificateEntry

object LinkedList的使用 extends App {

  //LinkedList------可变------里面两个方法elem和next
  //使用elem可以引用其头部，使用next可以引用其尾部


  //使用while循环，给linkedlist中的每个元素乘以2
  val ll = scala.collection.mutable.LinkedList(1,2,3,4,5)
  var currentList  = ll//这个赋值的本质也是赋值的是地址值的引用
  while(currentList!=Nil){
    currentList.elem = currentList.elem*2//取第一个元素乘以2(本质是取的头部元素的地址值)
    currentList = currentList.next//取后面的列表（本质是取的是每个元素的地址值）
  }
  //println(ll)



  // 案例：使用while循环将LinkedList中，从第一个元素开始，每隔一个元素，乘以2
  val list = scala.collection.mutable.LinkedList(1,2,3,4,5,6,7,8,9,10)
  var currentList2 = list//注意这步是把每一个元素的地址值引用进行了赋值
  var isFirst = true
  while(currentList2!=Nil && currentList2.next!=Nil){
    if(isFirst){
      currentList2.elem = currentList2.elem*2;
      isFirst=false
    }
    currentList2 = currentList2.next.next
    if(currentList2!=Nil){
      currentList2.elem = currentList2.elem*2
    }
  }
  println(list)


}
