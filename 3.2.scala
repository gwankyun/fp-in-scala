//import fpinscala.datastructures._
package object practice_3_2 {
  sealed trait List[+A]
  case object Nil extends List[Nothing]
  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  object List {
    def apply[A](as: A*): List[A] = {
      if (as.isEmpty) {
        Nil
      } else {
        Cons(as.head, apply(as.tail: _*))
      }
    }
  }

  def tail[A](ls: List[A]): List[A] = {
    ls match {
      case Nil        => Nil
      case Cons(h, t) => t
    }
  }
}







