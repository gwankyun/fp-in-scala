import tree._

package object practice_3_27 {
  def depth(tree: Tree[Int]): Int = {
    tree match {
      case Leaf(_)             => 0
      case Brance(left, right) => depth(left).max(depth(right)) + 1
    }
  }
}