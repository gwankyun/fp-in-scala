import fpinscala.datastructures._

package object practice_3_17 {
  def allToString(as: List[Double]): List[String] = {
    as match {
      case Nil        => Nil
      case Cons(h, t) => Cons(h.toString, allToString(t))
    }
  }
}