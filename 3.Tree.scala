package tree

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Brance[A](left: Tree[A], right: Tree[A]) extends Tree[A]