package B_02_多维数组_scala与java数组的隐式转换

object 多维数据的创建 {
  def main(args: Array[String]): Unit = {
   /* //规则的多维数组
    val multiDimArr1 = Array.ofDim[Double](3,4)
    multiDimArr1(2)(2) = 1.0
    for (arr <- multiDimArr1){
      for(num <- arr){
        print(num)
        print(" ")
      }
      println("")
    }*/

    //不规则的多维数组
    val multiDimArr2 = new Array[Array[Double]](3)
    multiDimArr2(0) = new Array[Double] (1)
    multiDimArr2(1) = new Array[Double] (2)
    multiDimArr2(2) = new Array[Double] (3)
    multiDimArr2(1)(1) = 1.0
    for (i <- 0 until multiDimArr2.length ){
      for(j <- 0 until multiDimArr2(i).length){
        print(multiDimArr2(i)(j)+" ")
      }
      println("")
    }

  }
}
