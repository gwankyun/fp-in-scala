import fpinscala.datastructures._
import practice_3_10._

package object practice_3_12 {
  def reverse[A](as: List[A]): List[A] = {
    val nil: List[A] = Nil
    foldLeft(as, nil)((l, i) => Cons(i, l))
  }
}