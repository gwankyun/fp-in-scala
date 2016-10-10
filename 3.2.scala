import fpinscala.datastructures._
package object practice_3_2 {
  def tail[A](ls: List[A]): List[A] = {
    ls match {
      case Nil        => Nil
      case Cons(_, t) => t
    }
  }
}







