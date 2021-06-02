package A_07_函数式编程之集合操作

object 集合的函数式编程 extends App{
  //map的使用-----返回的是一个list
 // List("hello","world","java").map("world is"+_).foreach(println)

  //flatMap的使用----返回的是一个list
  //List("hello world","you me").flatMap(_.split(" ")).foreach(println)

  //zip的使用---拉链操作----返回的是一个list----元素是tuple
  List("lucy","tom","jerry").zip(List(25,26,28)).foreach(println)

}
