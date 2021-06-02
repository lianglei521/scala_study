package B_09_提取器

object 只有一个参数的提取器 extends App{
val Person2(name) = "leo"
}

class Person2(val name: String)

object Person2 {
  def unapply(input: String): Option[String] = Some(input)
}


