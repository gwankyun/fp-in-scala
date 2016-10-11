import fpinscala.datastructures._

package object practice_3_14 {
  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    as match {
      case Nil        => z
      case Cons(h, t) => f(h, foldRight(t, z)(f))
    }
  }

  def append[A](as: List[A], bs: List[A]): List[A] = {
    foldRight(as, bs)((a, b) => Cons(a, b))
  }
}