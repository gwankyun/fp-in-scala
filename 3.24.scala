package object practice_3_24 {
  def hasSubsequence[A](sup: List[A], sub: List[A]): Boolean = {
    sup match {
      case Nil => false
      case ph :: pt =>
        sub match {
          case Nil => true
          case bh :: bt =>
            ph == bh && hasSubsequence(pt, bt)
        }
    }
  }
}