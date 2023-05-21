package exercises

object tree extends App {
  abstract class BinaryTree[+T] {
    def value: T
    def leftChild: BinaryTree[T]
    def rightChild: BinaryTree[T]
    def isEmpty: Boolean
    def isLeaf: Boolean
    def collectLeaves: List[BinaryTree[T]]
    def countLeaves: Int
    def nodesAtLevel(level: Int): List[BinaryTree[T]]
  }

  case object TreeEnd extends BinaryTree[Nothing] {
    override def value: Nothing = throw new NoSuchElementException
    override def leftChild: BinaryTree[Nothing] = throw new NoSuchElementException
    override def rightChild: BinaryTree[Nothing] = throw new NoSuchElementException
    override def isEmpty: Boolean = true
    override def isLeaf: Boolean = false
    override def collectLeaves: List[BinaryTree[Nothing]] = List()
    override def countLeaves: Int = 0
    override def nodesAtLevel(level: Int) = List():List[BinaryTree[Nothing]]
  }

  case class Node[+T](
                       override val value: T,
                       override val leftChild: BinaryTree[T],
                       override val rightChild: BinaryTree[T])
    extends BinaryTree[T] {
    override def isEmpty: Boolean = false
    override def isLeaf: Boolean = leftChild.isEmpty && rightChild.isEmpty
    override def collectLeaves: List[BinaryTree[T]] = {
      def loop(tr: BinaryTree[T] = this,
               setNode: Set[BinaryTree[T]] = Set(),
               acc: List[BinaryTree[T]] = List()): List[BinaryTree[T]] = {
        val nSetNode = setNode ++ Set(tr.leftChild, tr.rightChild).filterNot(_.isEmpty) - tr
        if (nSetNode.isEmpty) acc ++ List(tr)
        else if (tr.isLeaf) loop(nSetNode.head, nSetNode, acc ++ List(tr))
        else loop(nSetNode.head, nSetNode, acc)
      }
      loop()
    }
    override def countLeaves: Int = this.collectLeaves.length
    override def nodesAtLevel(level: Int): List[BinaryTree[T]] = {
      @scala.annotation.tailrec
      def loop(level: Int, acc: List[BinaryTree[T]] = List(this)): List[BinaryTree[T]] = {
        if (level == 0 || acc.isEmpty) acc
        else {
          val n_acc: List[BinaryTree[T]] = acc.filterNot(_.isLeaf)
            .flatMap(el => List(el.rightChild, el.leftChild)).filterNot(_.isEmpty)
          loop(level - 1, n_acc)
        }
      }
      loop(level)
    }

  }

  val tree = Node(1,
    Node(2,
      Node(4,
        TreeEnd,
        TreeEnd),
      Node(5,
        TreeEnd,
        Node(8,
          TreeEnd,
          TreeEnd))),
    Node(3,
      Node(6,
        TreeEnd,
        TreeEnd),
      Node(7,
        TreeEnd,
        TreeEnd)))

  println(tree.nodesAtLevel(3))
}
