import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberTreeTest {

    @Test
    fun testSize () {
        val tree : NumberTree = Empty
        assertEquals (0 , tree . size () ) // ein leerer Baum hat eine Größe von 1
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

        assignment1Tree = assignment1Tree.add(0)
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

        assignment2Tree = assignment2Tree.add(11)
        assertEquals (11, (((assignment2Tree.right as NumberNode).right as NumberNode).right as NumberNode).value)
    }
    @Test
    fun sum() {
        val tree : NumberTree = Empty
        assertEquals (0.0 , tree .sum () ) // ein leerer Baum hat eine Größe von 1


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
        assertEquals (33.0, assignment1Tree.sum () ) // der Baum aus Aufgabe 1 hat eine Größe von 7

    }

    @Test
    fun average() {
        val tree : NumberTree = Empty
        assertEquals (0.0 , tree . average() ) // ein leerer Baum hat eine Größe von 1


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
        assertEquals (33.0/7, assignment1Tree.average () ) // der Baum aus Aufgabe 1 hat eine Größe von 7
    }
}