package A_11_actor入门

import scala.actors.Actor

class LeoTelActor extends Actor{
  def act: Unit ={
    while (true){
      receive{
        case Message(content,sender) => {println(content);sender !"I am leo,please call me after 10 mimits"}
      }
    }
  }
}

