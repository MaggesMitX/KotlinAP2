class LinkedList <T: Comparable <T>> {
    data class Node<T>(val data: T, var next: Node<T>?)

    private var first: Node<T>? = null

    var countForSize : Int = 0

    // => Gibt zurück, ob die Liste leer ist oder nicht.
    fun isEmpty() : Boolean = first == null

    fun addFirst(data: T) { // => Fügt data als neuen Knoten (Node) am Anfang der Liste hinzu
        val runPointer =  Node(data, null)
        runPointer.next = first
        first = runPointer
        countForSize++
    }

    fun clear() {// => Leert die Liste.
        first = null
    }

/*    fun size() : Int { // => Gibt zurück, wie viele Elemente die Liste hat.
        var count = 0
        var runPointer = first
        while (runPointer != null) {
            count ++
            runPointer = runPointer.next
        }
        return count
    }*/

    override fun toString(): String { // => Wandelt die verkettete Liste in einen String um und gibt diesen zurück.
        val element = mutableListOf<T>()
        var runPointer = first
        while (runPointer != null) {
            element.add(runPointer.data)
            runPointer = runPointer.next
        }
        return element.joinToString(prefix = "[", postfix = "]")
    }

    fun addLast(data: T) { // => Fügt data als neuen Knoten am Ende der Liste hinzu.
        var runPointer = Node(data, null)
        if (isEmpty()) {
            first = runPointer
        } else {
            var newRunPointer = first
            while (newRunPointer?.next != null) {
                newRunPointer = newRunPointer.next
            }
            newRunPointer?.next = runPointer
            countForSize++
        }
    }

    fun addSorted(data: T) { // => Fügt data als neuen Knoten an der richtigen Stelle (sortiert) hinzu.
        var runPointer = Node(data, null)
        if (isEmpty() || data < first!!.data) {
            runPointer.next = first
            first = runPointer
        } else {
            var newRunPointer = first
            while (newRunPointer?.next != null && newRunPointer.next!!.data < data) {
                newRunPointer = newRunPointer.next
            }
            runPointer.next = newRunPointer?.next
            newRunPointer?.next = runPointer
            countForSize++
        }


        }
    fun appendList(newList: LinkedList<T>) { // => Fügt die übergebene Liste ans Ende der aktuellen Liste hinzu.
        if (isEmpty()) {
            first = newList.first
        } else {
            var runPointer =first
            while (runPointer?.next != null) {
                runPointer = runPointer.next
            }
        }
    }
    fun forEach(action: (T)-> Unit) {
        var runPointer = first
        while (runPointer != null) {
            action(runPointer.data)
            runPointer = runPointer.next
        }
    }
    fun size() : Int {
        println("Hier wird countForSize ausgegeben")
        return countForSize
    }
    fun firstWhere(condition: (T)-> Boolean): T? {
        var runPointer = first
        while (runPointer != null) {
            if (condition(runPointer.data)) {
                return runPointer.data
            }
            runPointer = runPointer.next
        }
        return null
    }

}
