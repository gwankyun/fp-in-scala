import fpinscala.datastructures._
package object practice_3_6 {
  def init[A](l: List[A]): List[A] = {
    l match {
      case Nil          => Nil
      case Cons(_, Nil) => Nil
      case Cons(h, t)   => Cons(h, init(t))
    }
  }
}