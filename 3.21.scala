import fpinscala.datastructures._
import practice_3_20._

package object practice_3_21 {
  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    flatMap(as)(i => if (f(i)) {
      List(i)
    } else {
      Nil: List[A]
    })
  }
}