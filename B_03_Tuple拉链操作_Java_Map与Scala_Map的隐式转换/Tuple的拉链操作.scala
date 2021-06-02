package B_03_Tuple拉链操作_Java_Map与Scala_Map的隐式转换

object Tuple的拉链操作 {
  def main(args: Array[String]): Unit = {
    val names = Array("leo","lucy")
    val scores = Array(89,87)
    val nameScores = names.zip(scores)
    for ((name,score) <- nameScores){
      println(name+":"+score)
    }
  }
}
