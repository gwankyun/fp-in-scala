import fpinscala.datastructures._

package object practice_3_16 {
  def allAdd1(as: List[Int]): List[Int] = {
    as match {
      case Nil        => Nil
      case Cons(h, t) => Cons(h + 1, allAdd1(t))
    }
  }
}