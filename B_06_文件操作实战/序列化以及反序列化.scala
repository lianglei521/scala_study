package B_06_文件操作实战

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

object 序列化以及反序列化 extends App{
  val leo = new Person("leo")
  val oos = new ObjectOutputStream(new FileOutputStream("F:\\workspace\\src\\test.obj"))
  oos.writeObject(leo)
  oos.close()

  val ois = new ObjectInputStream(new FileInputStream("F:\\workspace\\src\\test.obj"))
  //注意ois.readObject()返回的是anyRef类型
  val restoredLeo = ois.readObject().asInstanceOf[Person]
  print(restoredLeo.name)
}


@SerialVersionUID(42L) class Person(val name: String) extends Serializable
