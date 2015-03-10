// Alias.scala
import com.atomicscala.AtomicTest._

case class LongUnrulyNameFromSomeone()
type Short = LongUnrulyNameFromSomeone
new Short is LongUnrulyNameFromSomeone()
