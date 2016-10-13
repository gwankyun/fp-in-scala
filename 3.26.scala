import tree._

package object practice_3_26 {
  def maximum(tree: Tree[Int]): Int = {
    tree match {
      case Leaf(leaf)          => leaf
      case Brance(left, right) => maximum(left).max(maximum(right))
    }
  }
}