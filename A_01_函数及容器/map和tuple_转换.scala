package A_01_函数及容器

object map和tuple_转换 {

  def main(args: Array[String]): Unit = {
    //方式一：创建映射Map---也叫集合----不可变----不能实例化
    val ages = Map("leo"->28,"lucy"->29,"tom"->30)
   // ages("leo") = 35 //修改不了，会报错

    //方式二：创建一个可变的Map------不能实例化
    import scala.collection.mutable.Map
    val ages2 = Map("leo"->28,"lucy"->29,"tom"->30)
    ages2("leo") = 35

    //方式三：创建一个Map的另一种方式------不能实例化
    val ages3 = scala.collection.immutable.Map(("leo",28),("lucy",29),("tom"->30))

    //方式四：创建一个空的集合-----可以实例化的只有HashMap(Map的子类)
    val ages4 = new scala.collection.mutable.HashMap[String,Int]()
    ages4("wangwu") = 45


    //获取Map中指定key对应的值
    val age = ages4("wangwu")

    //如果获取不到会报错
    //val age1 = ages4("zhaoliu")

    //获取前可以先判断是否有contain
    val zhangsanAge = if(ages4.contains("zhangsan")) ages4("zhangsan") else 0

    //获取不到就用默认值getOrElse
    val lisiAge = ages4.getOrElse("lisi",88)


    //可变Map的增删改
    val age5 = scala.collection.mutable.Map("jerry"->56)//这个Map不能实例，里面必须有元素
    //增加
    age5 += ("niubi"->38,"maolv"->48)
    //删除
    age5 -= "maolv"
    //改
    age5("niubi") = 100

    //不可变Map的增加和删除
    val age6 = scala.collection.immutable.Map("lucy"->55)
    val age7 = age6 + ("hello"->66,("java",78))
    val age8 = age7 - "hello"

    //print(age8)


    //Map的遍历
    val age10 = Map("hadoop"->28,"spark"->35,"scala"->19,("java",29))
    //方式一：使用entrySet就是键值对的意思
    //for((key,value) <- age10)println(key+":"+value)

    //方式二：使用keySet
    //for(key <- age10.keySet) println(key)

    //方式三：使用values
    //for(value <- age10.values) println(value)

    //方式四：生成新的map 就是key和value互换--------这个项目中经常用到
    val age11 = for((key,value) <- age10) yield (value,key)
    //print(age11)


    //SortedMap可以自动对Map中的key进行排序---------注意是根据key进行的排序
    val age13 = scala.collection.immutable.SortedMap(89->"jack",45->"lucy",18->"tom")
    //print(age13)

    //LinkedHashMap可以记住插入entry的顺序
    val age14 = new scala.collection.mutable.LinkedHashMap[String,Int]
    age14 += ("jack"->11,"aq"->8,"bg"->89)
   // print(age14)


    //Tuple的操作
    val t = ("scala","java","python")
   // print(t._1+":"+t._2+":"+t._3)

    //zip的操作----针对数组
    val names  = Array("jack","lucy","tom")
    val agess = Array(18,29,25)
    val nameAges = names.zip(agess)
    for((key,value)<- nameAges)println(key+"----"+value)




  }
}
