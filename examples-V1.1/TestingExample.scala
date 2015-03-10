// TestingExample.scala
import com.atomicscala.AtomicTest._

val v1 = 11
val v2 = "a String"

// "Natural" syntax for test expressions:
v1 is 11
v2 is "a String"
v2 is "Produces Error" // Show failure
/* Output:
11
a String
a String
[Error] expected:
Produces Error
*/
