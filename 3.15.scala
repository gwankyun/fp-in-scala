import fpinscala.datastructures._
import practice_3_14._

package object practice_3_15 {
  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    as match {
      case Nil        => z
      case Cons(h, t) => f(h, foldRight(t, z)(f))
    }
  }

  def flat[A](as: List[List[A]]): List[A] = {
    val nil: List[A] = Nil
    foldRight(as, nil)((a, b) => append(a, b))
  }
}