// House3.scala

trait Building
trait Kitchen

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
