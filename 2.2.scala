package object practice_2_2 {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.size < 2) {
      true
    } else {
      ordered(as(0), as(1)) && isSorted(as.tail.tail, ordered)
    }
  }
}