package object practice_3_26 {
  sealed trait Tree[+A]
  case class Leaf[A](value: A) extends Tree[A]
  case class Brance[A](left: Tree[A], right: Tree[A]) extends Tree[A]
  
  object Tree {
    def maximum(tree: Tree[Int]): Int = {
      tree match {
        case Leaf(leaf)          => leaf
        case Brance(left, right) => maximum(left).max(maximum(right))
      }
    }
  }
}