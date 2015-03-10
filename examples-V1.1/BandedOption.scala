// BandedOption.scala
import com.atomicscala.AtomicTest._

def banded2(input:Double) =
  if(input > 1.0 || input < 0.0)
    None
  else
    Some(math.round(input * 100.0))

banded2(0.555) is Some(56)
banded2(-0.1) is None
banded2(1.1) is None

for(x <- banded2(0.1))
  x is 10

val result = for {
  d <- Vector(-0.1, 0.1, 0.3, 0.9, 1.2)
  n <- banded2(d)
} yield n
result is Vector(10, 30, 90)
