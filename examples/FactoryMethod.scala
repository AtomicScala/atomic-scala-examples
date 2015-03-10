// FactoryMethod.scala
import com.atomicscala.AtomicTest._

class Car(val make:String) {
  override def toString = s"Car($make)"
}

object Car {
  def apply(make:String) = new Car(make)
}

val myCar = Car("Toyota")
myCar is "Car(Toyota)"
