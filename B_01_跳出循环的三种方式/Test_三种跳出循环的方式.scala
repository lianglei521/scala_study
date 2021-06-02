package B_01_跳出循环的三种方式

object Test_三种跳出循环的方式 {
  def main(args: Array[String]): Unit = {
    //方式一，通过过boolean的方式
   /* var sum = 0;
    var i = 0;
    var flag = true;
    while(flag){
      sum += i
      i += 1
      if(i==5){
        flag = false
      }
    }
    print(sum)*/

    //方式二，通过嵌套函数中使用return
    /*def add_outer() = {
    var sum = 0
      def add_inner(): Unit ={
        for(i <- 0 to 10){
          if(i==5){
            return
          }
          sum += i
        }
      }
      add_inner()
      print(sum)
    }
    add_outer()*/

    //第三中方式，通过使用Breakes对象的break方法---与breakable代码配合使用
    import scala.util.control.Breaks._
    var sum = 0
    breakable{
      for(i <- 0 to 10){
        if(i==5){
          break()
        }
        sum += i
      }
    }
    print(sum)
  }
}
