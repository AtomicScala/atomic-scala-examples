// IndexWithZip.scala
import com.atomicscala.AtomicTest._

def number(s:String) =
  Range(0, s.length).zip(s)

number("Howdy") is
Vector((0,'H'), (1,'o'), (2,'w'),
       (3,'d'), (4,'y'))
