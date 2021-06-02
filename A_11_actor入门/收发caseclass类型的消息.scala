package A_11_actor入门

import scala.actors.Actor

case class Login(username:String,password:String)
case class Register(username:String,password:String)
class UserManagerActor extends Actor{
  def act(){
    while (true){
      receive{
      case Login(username,password) => println("login,username is "+username+",password is "+password )
      case Register(username,password) => println("register,username is "+username+",password is "+password )
      }
    }
  }
}

object 收发caseclass类型的消息 extends App{
val userManagerActor = new UserManagerActor
  userManagerActor.start()
  userManagerActor ! Login("leo","123")
  userManagerActor ! Register("lucy","456")

}
