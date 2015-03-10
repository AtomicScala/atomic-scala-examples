// ContainerOfOne.scala
import com.atomicscala.AtomicTest._
import util.{Try, Success}

Try("1".toInt).map(_ + 1) is Success(2)
Try("1".toInt).map(_ + 1).foreach(println)
// Doesn't print anything:
Try("x".toInt).map(_ + 1).foreach(println)
