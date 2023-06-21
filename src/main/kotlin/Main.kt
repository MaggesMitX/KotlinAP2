class NumberNode(val value: Int, var left: NumberNode? = null, var right: NumberNode? = null) // TreeNode

open class NumberTree { //Tree
    var root: NumberNode? = null

    object Empty : NumberTree()

    private fun insertRecursive(currentNode: NumberNode, value: Int) {
        if (value < currentNode.value) {
            if (currentNode.left == null) {
                currentNode.left = NumberNode(value)
            } else {
                insertRecursive(currentNode.left!!, value)
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = NumberNode(value)
            } else {
                insertRecursive(currentNode.right!!, value)
            }
        }
    }

    fun size(): Int {
        return sizeRecursive(root)
    }
    private fun sizeRecursive(currentNode: NumberNode?): Int {
        if (currentNode == null) {
            return 0
        }
        return 1 + sizeRecursive(currentNode.left) + sizeRecursive(currentNode.right)
    }
    fun add(number: Int): NumberTree {
        val newTree = NumberTree()
        newTree.root = addRecursive(root, number)
        return newTree
    }
    private fun addRecursive(currentNode: NumberNode?, number: Int): NumberNode {
        if (currentNode == null) {
            return NumberNode(number)
        }

        if (number <= currentNode.value) {
            currentNode.left = addRecursive(currentNode.left, number)
        } else {
            currentNode.right = addRecursive(currentNode.right, number)
        }

        return currentNode
    }
    fun sum(): Double {
        return sumRecursive(root)
    }

    private fun sumRecursive(currentNode: NumberNode?): Double {
        if (currentNode == null) {
            return 0.0
        }
        return currentNode.value.toDouble() + sumRecursive(currentNode.left) + sumRecursive(currentNode.right)
    }

    fun average(): Double {
        val sum = sum()
        val count = size()
        return if (count > 0) sum / count else 0.0
    }

}
fun main() {
    val tree = NumberTree()
    val tree1 = NumberNode(1)
    val tree2 = NumberNode(2)
    val tree4 = NumberNode(4)
    val tree3 = NumberNode(3)
    val tree5 = NumberNode(5,)
    val tree8 = NumberNode(8)
    val tree10 = NumberNode(10)


    println("Size: ${tree.size()}") // Ausgabe: Size: 7
    println("Sum: ${tree.sum()}") // Ausgabe: Sum: 34.0
    println("Average: ${tree.average()}") // Ausgabe: Average: 4.857142857142857
}
