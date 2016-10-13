import fpinscala.datastructures._

package object practice_3_22 {
  def add2List(as: List[Int], bs: List[Int]): List[Int] = {
    as match {
      case Nil => Nil
      case Cons(h, t) =>
        bs match {
          case Nil          => Nil
          case Cons(bh, bt) => Cons(h + bh, add2List(t, bt))
        }
    }
  }
}