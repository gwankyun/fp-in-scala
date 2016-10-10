import fpinscala.datastructures._
package object practice_3_3 {
  def setHead[A](as: List[A], h: A): List[A] = {
    as match {
      case Nil        => Nil
      case Cons(_, t) => Cons(h, t)
    }
  }
}