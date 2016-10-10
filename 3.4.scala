import fpinscala.datastructures._
package object practice_3_4 {
  @annotation.tailrec
  def drop[A](l: List[A], n: Int): List[A] = {
    (l, n) match {
      case (Nil, _)        => Nil
      case (_, 0)          => l
      case (Cons(h, t), n) => drop(t, n - 1)
    }
  }
}