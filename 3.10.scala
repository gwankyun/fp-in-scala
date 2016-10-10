package object practice_3_10 {
  def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = {
    @annotation.tailrec
    def go(as: List[A], b: B): B = {
      as match {
        case Nil    => b
        case h :: t => go(t, f(b, h))
      }
    }
    go(as, z)
  }
}