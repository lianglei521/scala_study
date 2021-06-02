package A_06_scala函数式编程
import javax.swing._
import java.awt.event._


object SAM转换 extends App{
  /**
  val button = new JButton("Click")
  button.addActionListener(new ActionListener {
    override def actionPerformed(event: ActionEvent) {
      println("Click Me!!!")
    }
  })
   */

  val button = new JButton("Click")
  implicit def getActionListener(actionProcessFunc: (ActionEvent) => Unit) = new ActionListener {
    override def actionPerformed(event: ActionEvent) {
      actionProcessFunc(event)
    }
  }
  button.addActionListener((event: ActionEvent) => println("Click Me!!!"))


}
