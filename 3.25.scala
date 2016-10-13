import tree._

package object practice_3_25 {
  def size[A](tree: Tree[A]): Int = {
    tree match {
      case Leaf(_)             => 1
      case Brance(left, right) => 1 + size(left) + size(right)
    }
  }
}