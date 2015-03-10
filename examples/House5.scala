// House5.scala

trait Building
trait Room
trait Storage
trait Sink
trait Store[T]
trait Cook[T]
trait Clean[T]
trait Food extends Store[Food]
  with Clean[Food] with Cook[Food]
trait Utensil extends Store[Utensil]
  with Clean[Utensil] with Cook[Utensil]

trait Kitchen extends Room {
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food
  val utensils:Vector[Utensil]
}

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
