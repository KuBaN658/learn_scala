package exercises
import scala.annotation.tailrec
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
    def collectNodes(): List[T]
    def hasPath(tree: BinaryTree[Int], target: Int): Boolean
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
    override def collectNodes() = List(): List[Nothing]
    def hasPath(tree: BinaryTree[Int], target: Int): Boolean = false
  }

  case class Node[+T](
                       override val value: T,
                       override val leftChild: BinaryTree[T],
                       override val rightChild: BinaryTree[T])
    extends BinaryTree[T] {
    override def isEmpty: Boolean = false
    override def isLeaf: Boolean = leftChild.isEmpty && rightChild.isEmpty
    override def collectLeaves: List[BinaryTree[T]] = {
      @tailrec
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
      @tailrec
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
    override def collectNodes(): List[T] = {
      @tailrec
      def loop(acc: List[BinaryTree[T]] = List(this), lastLevel: List[BinaryTree[T]] = List(this)): List[T] = {
        val n_acc = lastLevel.flatMap(elem => List(elem.leftChild, elem.rightChild)).filterNot(_.isEmpty)
        if (n_acc.isEmpty) acc.map(_.value)
        else loop(acc ++ n_acc, n_acc)
      }
      loop()
    }
    def hasPath(tree: BinaryTree[Int], target: Int): Boolean = {
      @tailrec
      def loop(acc: Map[BinaryTree[Int],Int] = Map(tree -> tree.value)): Boolean = {
        val nAcc: Map[BinaryTree[Int], Int] = acc.filterNot((key: BinaryTree[Int], value: Int) => key.isLeaf)
          .flatMap((key, value) => (key, value) match {
            case (key, value) if key.leftChild.isEmpty => Map(key.rightChild -> (value + key.rightChild.value))
            case (key, value) if key.rightChild.isEmpty => Map(key.leftChild -> (value + key.leftChild.value))
            case _ => Map(key.leftChild -> (value + key.leftChild.value), key.rightChild -> (value + key.rightChild.value))
          })

        if (acc.filter((key, value) => key.isLeaf && value == target).nonEmpty) true
        else if (nAcc.isEmpty) false
        else loop(nAcc)
      }
      if (tree.isEmpty) false
      else loop()
    }

    def findAllPaths(tree: BinaryTree[String], target: String): List[List[String]] = {
      @tailrec
      def loop(acc: Map[BinaryTree[String], Tuple2[Int, List[String]]] =
               Map(tree -> Tuple2(tree.value.toInt, List(tree.value))), accRes: List[List[String]] = List()): List[List[String]] = {
        val nAcc = acc.filterNot(elem => elem._1.isLeaf).flatMap(elem => elem match {
          case (key:BinaryTree[String], value: Tuple2[Int, List[String]]) if key.leftChild.isEmpty =>
            Map(key.rightChild -> Tuple2(value._1 + key.rightChild.value.toInt, value._2 ++ List(key.rightChild.value)))
          case (key:BinaryTree[String], value: Tuple2[Int, List[String]]) if key.rightChild.isEmpty =>
            Map(key.leftChild -> Tuple2(value._1 + key.leftChild.value.toInt, value._2 ++ List(key.leftChild.value)))
          case (key:BinaryTree[String], value: Tuple2[Int, List[String]]) =>
            Map(key.rightChild -> Tuple2(value._1 + key.rightChild.value.toInt, value._2 ++ List(key.rightChild.value)),
                key.leftChild -> Tuple2(value._1 + key.leftChild.value.toInt, value._2 ++ List(key.leftChild.value)))
        })
          val lstPth = acc.toList.filter(elem => elem match {
            case (key:BinaryTree[String], value: Tuple2[Int, List[String]]) if key.isLeaf && value._1 == target.toInt =>
              true
            case _ => false
          }).map(elem => elem._2._2)
        println(f"acc = $acc\nnAcc = $nAcc\nlstPth = $lstPth\naccRes = $accRes")
        if (nAcc.forall(elem => elem._1.isEmpty)) lstPth ++ accRes
        else loop(nAcc, lstPth ++ accRes)
      }
      if (tree.isEmpty) List()
      else loop()
    }
  }

  val tree = Node("1",
    Node("12",
      Node("4",
        TreeEnd,
        Node("8",
          TreeEnd,
          TreeEnd)),
      Node("5",
        TreeEnd,
        TreeEnd)),
    Node("3",
      Node("6",
        TreeEnd,
        TreeEnd),
      Node("7",
        TreeEnd,
        TreeEnd))
  )

  println(tree.findAllPaths(tree, "25"))
}
