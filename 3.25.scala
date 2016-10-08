package object practice_3_25 {
  sealed trait Tree[+A]
  case class Leaf[A](value: A) extends Tree[A]
  case class Brance[A](left: Tree[A], right: Tree[A]) extends Tree[A]

  object Tree {
    def size[A](tree: Tree[A]): Int = {
      tree match {
        case Leaf(_)             => 1
        case Brance(left, right) => 1 + size(left) + size(right)
      }
    }
  }
}