// Sets.scala
import com.atomicscala.AtomicTest._

val set =
  Set(1, 1, 2, 3, 9, 9, 4, 22, 11, 7, 6)
// No duplicates:
set is Set(1, 6, 9, 2, 22, 7, 3, 11, 4)

// Set membership:
set(9) is true
set(99) is false

// Is this set contained within another?
Set(1, 6, 9, 2).subsetOf(set) is true

// Two different versions of set union:
set.union(Set(2, 3, 4, 99)) is
  Set(1, 6, 9, 2, 22, 7, 3, 11, 99, 4)
set | Set(2, 3, 4, 99) is
  Set(1, 6, 9, 2, 22, 7, 3, 11, 99, 4)

// Set intersection:
set & Set(0,1,11,22,87) is Set(1,22,11)
set intersect Set(0,1,11,22,87) is
  Set(1,22,11)

// Set difference:
set &~ Set(0, 1, 11, 22, 87) is
  Set(6, 9, 2, 7, 3, 4)
set -- Set(0, 1, 11, 22, 87) is
  Set(6, 9, 2, 7, 3, 4)
