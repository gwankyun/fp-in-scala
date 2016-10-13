import fpinscala.datastructures._

package object practice_3_23 {
  def zipWith[A, B, C](as: List[A], bs: List[B])(f: (A, B) => C): List[C] = {
    as match {
      case Nil => Nil
      case Cons(ah, at) =>
        bs match {
          case Nil          => Nil
          case Cons(bh, bt) => Cons(f(ah, bh), zipWith(at, bt)(f))
        }
    }
  }
}