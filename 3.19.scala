import fpinscala.datastructures._

package object practice_3_19 {
  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    as match {
      case Nil => Nil
      case Cons(h, t) => if (f(h)) {
        Cons(h, filter(t)(f))
      } else {
        filter(t)(f)
      }
    }
  }
}