import fpinscala.datastructures._
package object practice_3_5 {
  @annotation.tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      case Nil => Nil
      case Cons(h, t) => if (f(h)) {
        dropWhile(t, f)
      } else {
        l
      }
    }
  }
}