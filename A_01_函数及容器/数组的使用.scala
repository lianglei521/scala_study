package A_01_函数及容器

import scala.collection.mutable

//import java.util

object 数组的使用 {
  def main(args: Array[String]): Unit = {

    //数组的第一种初始化方式只定义了长度
    val a = new Array[Int](10)

    //数组的第二种初始化方式--里面放了元素
    val b = Array("hello",5)
    a(0)= 1
   // print(a)
//    for (i <- b){
//      println(i)
//    }

    //可变数组必须先导入一个包才能使用
    import scala.collection.mutable.ArrayBuffer

    //一个元素的添加
    val c = ArrayBuffer(1,2,3,4,5)
    c += 6
    //添加一个数组
    val d = ArrayBuffer(6,7,8,9,10)
    c ++= d

    //数组中插入元素---在指定的索引位置---可以插入任意个数的元素
    c.insert(0,1,2,3)

    //删除数组中的元素,从索引12开始，移除2个元素
    //c.remove(12,2)

    //指定索引位置开始，默认移除一个元素
    c.remove(13)

    //ArrayBUffer转换为Array---生成了新的数组
    val cArray = c.toArray

    //Array转换为ArrayBuffer------生成了新的数组
    val cArrayBuffer = cArray.toBuffer

    //打印的时候可以先转换为集合list
    //print(c.toList)


    //数组的遍历多种方式

    val array  = Array(1,2,3,4,5,6,7,8,9,10)

    //方式一（使用to来遍历）
    //for(i <- 0 to array.length-1) println(i)

    //方式二（使用until来遍历）
   // for(i <- 0 until array.length) println(i)

    //方式三（跳跃遍历）
    //for(i <- 0 until (array.length,2))println(array(i))

    //方式四（从尾部向头遍历）
    //for(i <- (0 until array.length).reverse) println(i)

    //方式五（类似于java中的增强for）
   // for(i <- array) println(i)



    //数组的其它操作
    val arrayBuffer = ArrayBuffer(7,5,3,1,9,4,6,2,8)

    //数组的求和
    val sum = arrayBuffer.sum
   // print(sum)

    //对数组的排序(快排)----只能对不可变的数组排序---而且是不生成新的数组
    import scala.util.Sorting.quickSort
    val new_array = arrayBuffer.toArray
    quickSort(new_array)
     //print(new_array.toList)

    //求数组的最大值
    val maxNum = array.max
   // print(maxNum)

    //数组转换成字符串
    val str = new_array.toString //这个打印的是地址值[I@1324409e
    val str2 = new_array.mkString(",")
    val str3 = new_array.mkString("<",",",">")
    val str4 = arrayBuffer.toString //这个打印的是ArrayBuffer(7, 5, 3, 1, 9, 4, 6, 2, 8)
    val str5 = arrayBuffer.mkString(",")
    val str6 = arrayBuffer.mkString("<",",",">")
//    println(str)
//    println(str2)
//    println(str3)
//    println(str4)
//    println(str5)
//    println(str6)



    //数组的转换
    //使用yield推导式----对Array转换获取的还是Array-------不可以直接打印
    val array2 = Array(1,2,3)
    val array3 = for(i <- array2) yield i*i
    //print(array3.toList)

    //使用yield推导式----对ArrayBuffer转换获取的还是ArrayBuffer-----可以直接打印
    val e = new ArrayBuffer[Int]()
    e += (1,2,3,4,5,6)
    val eArrayBuffer = for(i <- e) yield i*i
    //print(eArrayBuffer)


    //带守卫if的转换------相当于提取的元素过滤掉一部分
    var f = Array(1,2,3,4,5,6,7,8,9)
    val g = for(i <- f if i%2 == 0) yield i*i
    //print(g.toList)


    //使用函数式编程来转换数组
    val h = new ArrayBuffer[Int]()
    h += (1,2,3,4,5,6)
    val i = h.filter(_%2 == 0).map(_*2)
    //print(i)



    //需求是：移除掉可变数组里第一个负数后面的所有负数
    val ab = new ArrayBuffer[Int]();
    ab += (1,2,3,4,5,-1,-6,-7,8,-9);
    var foundFirstNegative = false;//定义一个是否发现第一个负数的标识，发现为True,反之为False
    var arrayLength = ab.length;//定义数组的长度
    var index = 0;//定义一个索引
    while(index < arrayLength){
        if(ab(index)>= 0){
          index += 1;
        }else{
          if(!foundFirstNegative){
            foundFirstNegative = true;
            index += 1
          }else{
            ab.remove(index);
            arrayLength -=1;
          }
        }
    }
    print(ab)


    //改进版的 需求是：移除掉可变数组里第一个负数后面的所有负数
    val ab2 = new ArrayBuffer[Int]()
    ab2 += (1,2,3,4,5,-6,-7,8,-9)
    var arrayLength2 = ab2.length
    var foundFirstNegative2 = false
    val keepIndexes = for (i <- 0 until arrayLength2 if  foundFirstNegative2 == false ||ab2(i) >= 0 ) yield{
      if (ab2(i)< 0) foundFirstNegative2 = true;
      i
    }
    for (i <- 0 until keepIndexes.length){
      ab2(i) = ab2(keepIndexes(i))
    }
    //去除数组几个末尾的元素
    ab2.trimEnd(ab2.length-keepIndexes.length)
    print(ab2)

   /* val list = util.LinkedList
    list.+("1")*/
  
  }
}
