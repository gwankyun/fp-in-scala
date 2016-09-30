def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
  as match {
    case Nil    => z
    case h :: t => f(h, foldRight(t, z)(f))
  }
}
def length[A](as: List[A]): Int = {
  foldRight(as, 0)((i, c) => c + 1)
}