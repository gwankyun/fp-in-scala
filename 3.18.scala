import fpinscala.datastructures._

package object practice_3_18 {
  def map[A, B](as: List[A])(f: A => B): List[B] = {
    as match {
      case Nil        => Nil
      case Cons(h, t) => Cons(f(h), map(t)(f))
    }
  }
}