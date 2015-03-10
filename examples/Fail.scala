// Fail.scala
package com.atomicscala.reporterr
import util.Failure
import util.control.NoStackTrace

class FailMsg(val msg:String) extends
Throwable with NoStackTrace {
  override def toString = msg
}

object Fail {
  def apply(msg:String) =
    Failure(new FailMsg(msg))
}
