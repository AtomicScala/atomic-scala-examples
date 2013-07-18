// House4.scala

trait Building
trait Food
trait Utensils
trait Store[T]
trait Cook[T]
trait Clean[T]
trait Kitchen extends Store[Food]
  with Cook[Food] with Clean[Utensils]
  // Oops. Can't do this:
  // with Store[Utensils]
  // with Clean[Food]

trait House extends Building {
  val kitchens:Vector[Kitchen]
}
