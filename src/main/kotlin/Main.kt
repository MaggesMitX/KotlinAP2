import java.awt.font.NumericShaper
import kotlin.math.E

sealed class NumberTree { //Ableitungen müssen in dieser Klasse liegen
    abstract fun size() : Int
    abstract fun add(number : Int) : NumberNode
    abstract fun sum() : Double
    abstract fun average() : Double


}
object Empty : NumberTree() {

    override fun size(): Int = 0

    override fun add(number: Int) : NumberNode = NumberNode(number)

    override fun sum(): Double = 0.0

    override fun average(): Double = 0.0


}

class NumberNode (val value : Int, val left : NumberTree = Empty, val right : NumberTree = Empty) : NumberTree() {

    override fun size(): Int = 1 + left.size() + right.size()

    override fun add(number: Int) : NumberNode {
        return if (number <= value) {
            NumberNode(value, left.add(number), right)
        } else {
            NumberNode(value, left, right.add(number))
        }
    }

    override fun sum(): Double {
          return value + left.sum() + right.sum()
    }

    override fun average(): Double {
        return sum()/size()
    }


}




fun main() {
    println("Bäums erzeugen")

    val tree1 = NumberNode(1)
    val tree4 = NumberNode(4)
    val tree10 = NumberNode(10)

    val tree2 = NumberNode(2, tree1)
    val tree3 = NumberNode(3, tree2, tree4)
    val tree8 = NumberNode(8, Empty, tree10)
    val root = NumberNode(5,tree3, tree8)


}
