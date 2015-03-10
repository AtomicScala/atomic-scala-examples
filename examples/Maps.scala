// Maps.scala
import com.atomicscala.AtomicTest._

val constants = Map("Pi" -> 3.141,
  "e" -> 2.718, "phi" -> 1.618)

Map(("Pi", 3.141), ("e", 2.718),
  ("phi", 1.618)) is constants

Vector(("Pi", 3.141), ("e", 2.718),
  ("phi", 1.618)).toMap is constants

// Look up a value from a key:
constants("e") is 2.718

constants.keys is "Set(Pi, e, phi)"

constants.values is
"MapLike(3.141, 2.718, 1.618)"

// Iterate through key-value pairs:
(for(pair <- constants)
  yield pair.toString) is
"List((Pi,3.141), (e,2.718), (phi,1.618))"

// Unpack during iteration:
(for((k,v) <- constants)
  yield k + ": " + v) is
"List(Pi: 3.141, e: 2.718, phi: 1.618)"
