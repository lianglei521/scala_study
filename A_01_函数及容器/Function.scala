package A_01_函数及容器

object Function {
  def main(args: Array[String]): Unit = {

    //if...else..的用法
  def sayHello(name:String,age:Int): Int ={
    if(age>18){
      printf("Hi,%s,you are bi boy!!!\n",name)
      age
    }else{
      printf("Hi,%s,you are little boy!!!\n",name)
      age
    }
  }
    //定义一个斐波那契函数
  def fab(num:Int):Int = {
    if (num<=1) 1
    else fab(num-1)+fab(num-2)
  }

    //默认参数的函数
    def sayHello2(name:String,age:Int=20)={
      printf("Hi,%s,你好\n",name)
      age
    }

    //定义一个变长函数------注意里面都可以不放参数都可以
    def sum(nums:Int*):Int={
      var result = 0
      for (num <- nums){
        result += num
      }
      result
    }

    //递归调用变长参数的函数----注意序列调用变长函数时的特殊语法的使用后面加(：_*)
    def sum2(num:Int*):Int = {
      if (num.head == 0){
        0
      } else{
        num.head + sum2(num.tail: _*)
      }
    }


//  val num = sayHello("梁磊",17)
//  println(num)

//    print(fab(5))

//    print(sayHello2("大宝"))

//    print(sum(1,2,3,4，5))
    //注意将一个序列用scala的特殊语法定义成序列才能被一个变长参数的函数识别，源码中大量的使用到
    //print(sum(1 to 5: _*))
    print(sum())
  }
}
