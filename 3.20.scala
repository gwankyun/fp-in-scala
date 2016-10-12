import fpinscala.datastructures._
import practice_3_10._
import practice_3_14._

package object practice_3_20 {
  def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = {
    foldLeft(as, Nil: List[B])((a, b) => append(a, f(b)))
  }
}