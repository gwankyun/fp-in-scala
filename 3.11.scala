import fpinscala.datastructures._
import practice_3_10._
package object practice_3_11 {
  def sum(as: List[Int]): Int = {
    foldLeft(as, 0)(_ + _)
  }

  def product(as: List[Int]): Int = {
    foldLeft(as, 1)(_ * _)
  }

  def length[A](as: List[A]): Int = {
    foldLeft(as, 0)((c, i) => c + 1)
  }
}