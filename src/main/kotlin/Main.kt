fun main () {
    val fruits = LinkedList<String>()
    val newList = LinkedList<String>()
    fruits.addFirst("Birne")
    fruits.addFirst("Apfel")
    println(fruits.toString()) // [Apfel, Birne]
    fruits.addLast("Erdbeere")
    println(fruits.toString()) // [Apfel, Birne, Erdbeere]
    fruits.addSorted("Banane")
    println(fruits.toString()) // [Apfel, Banane, Birne, Erdbeere]
    fruits.addSorted("Blaubeere")
    println(fruits.toString()) // [Apfel, Banane, Birne, Blaubeere, Erdbeere]

    println("Jetzt gleich kommt CountForSize")
    println(fruits.size())


    newList.addLast("Wassermelone")
    newList.addLast("Mango")
    fruits.appendList(newList)
    println(fruits.toString()) // [Apfel, Banane, Birne, Blaubeere, Erdbeere, Wassermelone, Mango]

    fruits.forEach { element ->
        println(element)
    }

    val found = fruits . firstWhere { element ->
        element . startsWith ("B")
    }
    println ( found ) // Banane
    val found2 = fruits . firstWhere { element ->
        element . contains (" beere ")
    }
    println ( found2 ) // Blaubeere
    val found3 = fruits . firstWhere { element ->
        element . length > 10
    }
    println ( found3 ) // Wassermelone

}
//Aufgabe 2 Was sind Funktionen höherer Ordnung?

// Was bedeutet es, wenn ein Algorithmus eine Laufzeit von O(1), O(n) oder O(n2) hat?
// O(1) -> Laufzeit bleibt gleich egal wie groß die Eingabe ist. Immer gleiche Zugriffszeit Bsp. Algorithmus= variable deklarieren/ If abfrage
// O(n) ->  Lineare Laufzeit, die proportional zur Größe der Eingabe ist. Bsp. Algorithmus= while schleife(input menge)
// O(n^2) -> Quadratische Laufzeit, die exponentiell der Eingabe steigt. Bsp. Algorithmus= Zwei ineinandergeschachtelte schleifen