package A_11_actor入门

import scala.actors.Actor

class HelloActor extends Actor{
   def act(){
     while(true){
       receive{
         case name:String => print("hello" + name)
       }
     }
   }
}


object Actor的创建启动收发 extends App{
  val actor  = new HelloActor
  actor.start()
  actor ! "leo"
}
