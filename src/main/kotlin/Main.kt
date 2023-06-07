fun main () {
    val fruits = LinkedList < String >()
    fruits . addFirst (" Birne ")
    fruits . addFirst (" Apfel ")
    println ( fruits . toString () ) // [Apfel , Birne ]
    fruits . addLast (" Erdbeere ")
    println ( fruits . toString () ) // [Apfel , Birne , Erdbeere ]
    fruits . addSorted (" Banane ")
    println ( fruits . toString () ) // [Apfel , Banane , Birne , Erdbeere ]
    fruits . addSorted (" Blaubeere ")
    println ( fruits . toString () ) // [Apfel , Banane , Birne , Blaubeere ,
    Erdbeere ]
    val newList = LinkedList <String >()
    newList . addLast (" Wassermelone ")
    newList . addLast (" Mango ")
    fruits . appendList ( newList )
    println ( fruits . toString () ) // [Apfel , Banane , Birne , Blaubeere ,
    Erdbeere , Wassermelone , Mango ]
}
