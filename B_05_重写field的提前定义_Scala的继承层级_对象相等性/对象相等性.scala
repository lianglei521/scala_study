package B_05_重写field的提前定义_Scala的继承层级_对象相等性

object 对象相等性 {
  def main(args: Array[String]): Unit = {
    val p1 = new Product("香蕉",18)
    val p2 = new Product("香蕉",18)
    println(p1==p2)
  }
}

class Product(val name: String, val price: Double )

//重写equals和hashCode方法
/*
class Product(val name: String, val price: Double) {

  final override def equals(other: Any) = {
    val that = other.asInstanceOf[Product]
    if(that == null) false
    else name == that.name && price == that.price
  }

  final override def hashCode = 13 * name.hashCode + 17 * price.hashCode

}*/
