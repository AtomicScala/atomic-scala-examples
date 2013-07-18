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
trait Utensils extends Store[Utensils]
  with Clean[Utensils] with Cook[Utensils]

trait Kitchen extends Room {
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food
  val utensils:Utensils
}

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
