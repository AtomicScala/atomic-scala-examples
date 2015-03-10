// CallLater.scala

class Later(val f: () => Unit) {
  def call():Unit = { f() }
}

val cl = new Later(() => println("now"))
cl.call()
