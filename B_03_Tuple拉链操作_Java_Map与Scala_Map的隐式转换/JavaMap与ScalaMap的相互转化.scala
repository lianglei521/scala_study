package B_03_Tuple拉链操作_Java_Map与Scala_Map的隐式转换


object JavaMap与ScalaMap的相互转化 {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConversions.mapAsScalaMap
    val javaScores = new java.util.HashMap[String,Int]()
    javaScores.put("leo",89)
    javaScores.put("lucy",88)
    val scalaScores:scala.collection.mutable.Map[String,Int] = javaScores

    import scala.collection.JavaConversions.mapAsJavaMap
    import java.awt.font.TextAttribute._
    val scalaAttrMap = Map(FAMILY -> "Serif", SIZE -> 12)
    val font = new java.awt.Font(scalaAttrMap)



  }
}
