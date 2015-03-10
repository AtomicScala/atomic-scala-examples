// House4.scala

trait Building
trait Food
trait Utensil
trait Store[T]
trait Cook[T]
trait Clean[T]
trait Kitchen extends Store[Food]
  with Cook[Food] with Clean[Utensil]
  // Oops. Can't do this:
  // with Store[Utensil]
  // with Clean[Food]

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
