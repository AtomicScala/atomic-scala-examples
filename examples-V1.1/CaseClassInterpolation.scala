// CaseClassInterpolation.scala
import com.atomicscala.AtomicTest._

case class Sky(color:String)

s"""${new Sky("Blue")}""" is "Sky(Blue)"
