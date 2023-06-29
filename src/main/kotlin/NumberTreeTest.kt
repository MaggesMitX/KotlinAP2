import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class NumberTreeTest {
    @Test
    fun testSize () {       // hier wird ein leerer Baum Größe 0 getestet
        val tree : NumberTree = Empty
        assertEquals (0 , tree . size () ) // leerer Baum hat eine Größe von 1
        // Aufbau voller Baum
        val assignment1Tree : NumberTree =
            NumberNode (5,
                left = NumberNode (3,
                    left = NumberNode (2,
                        NumberNode (1)
                    ),
                    right = NumberNode (4)
                ),
                right = NumberNode (8,
                    right = NumberNode (10)
                )
            )// Test
        assertEquals (7, assignment1Tree.size () ) // der Baum aus Aufgabe 1 hat eine Größe von 7
    }
    @Test
    fun add() {
        var tree : NumberNode= Empty.add(5)
        assertEquals (5, tree.value)

        var assignment1Tree : NumberNode =
            NumberNode (5,
                left = NumberNode (3,
                    left = NumberNode (2,
                        NumberNode (1)
                    ),
                    right = NumberNode (4)
                ),
                right = NumberNode (8,
                    right = NumberNode (10)
                )
            )

        assignment1Tree = assignment1Tree.add(0)    // Wenn es links eingefügt wird beispiel
        assertEquals (0, ((((assignment1Tree.left as NumberNode).left as NumberNode).left as NumberNode).left as NumberNode).value)

        var assignment2Tree : NumberNode =
            NumberNode (5,
                left = NumberNode (3,
                    left = NumberNode (2,
                        NumberNode (1)
                    ),
                    right = NumberNode (4)
                ),
                right = NumberNode (8,
                    right = NumberNode (10)
                )
            )

        assignment2Tree = assignment2Tree.add(11) // Wenn es rechts eingefügt wird beispiel
        assertEquals (11, (((assignment2Tree.right as NumberNode).right as NumberNode).right as NumberNode).value)
    }
    @Test
    fun sum() {
        val tree : NumberTree = Empty
        assertEquals (0.0 , tree .sum () )

        val assignment1Tree : NumberTree =
            NumberNode (5,
                left = NumberNode (3,
                    left = NumberNode (2,
                        NumberNode (1)
                    ),
                    right = NumberNode (4)
                ),
                right = NumberNode (8,
                    right = NumberNode (10)
                )
            )
        assertEquals (33.0, assignment1Tree.sum () )

    }
    @Test
    fun average() {
        val tree : NumberTree = Empty
        assertEquals (0.0 , tree . average() )

        val assignment1Tree : NumberTree =
            NumberNode (5,
                left = NumberNode (3,
                    left = NumberNode (2,
                        NumberNode (1)
                    ),
                    right = NumberNode (4)
                ),
                right = NumberNode (8,
                    right = NumberNode (10)
                )
            )
        assertEquals (33.0/7, assignment1Tree.average () )
    }
}