package A_11_actor入门

object Test extends App{
  val leoTelActor = new LeoTelActor
  val jackTelActor = new JackTelActor(leoTelActor)

  leoTelActor.start()
  jackTelActor.start()
}
