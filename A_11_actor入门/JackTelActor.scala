package A_11_actor入门

import scala.actors.Actor

class JackTelActor(val leoTelActor: LeoTelActor) extends Actor{
  def act(): Unit ={
    while (true){
    leoTelActor ! Message("hello leo ,I am jack",this)
      receive{
        case response:String => println(response)
      }
    }
  }
}


