// House2.scala

trait Building
trait Kitchen

trait House extends Building {
  val kitchen1:Kitchen
  val kitchen2:Kitchen
}
