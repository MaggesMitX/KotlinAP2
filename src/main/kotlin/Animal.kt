abstract class Animal (val species : String ,val age : Int ) {

    val patenschaften = mutableListOf<Adoption>() //Liste der Patenschaften
    open fun makeSound () : String = "Ein Tier: $species macht ein Geräusch" + super.toString()
    fun addAdoption(adoption: Adoption) = patenschaften.add(adoption)
    override fun toString(): String {
        return species
    }


}
abstract class Pet(
    species : String ,
    age : Int ,
    val owner : String ,
    val name : String
) : Animal(species, age){
    override fun makeSound () : String = "$species sagt etwas."

}
class Cat(
    species : String ,
    age : Int ,
    val owner : String ,
    val name : String
) : Animal(species, age) {
    override fun makeSound () : String = "Die $species sagt etwas. Miau!"

    fun scratchFurniture () : String = "Die $species: $name welche $owner gehört, kratzt an den Möbeln"

}
class Dog(
    species : String ,
    age : Int ,
    val owner : String ,
    val name : String ,
    val wagsTail : Boolean
) : Animal(species, age) {
    override fun makeSound () : String = "$species sagt etwas."

    fun fetchToy () : String {
        return if (wagsTail) {
            "Der $species bringt das Spielzeug zurück. Er freut sich dabei und wackelt mit dem Schwanz!"
        }else{
            "Der $species bringt das Spielzeug zurück. Er wackelt nicht mit dem Schwanz und freut sich nicht."
        }
    }
}
open class Bird (
    species : String ,
    age : Int ,
    val nocturnal : Boolean
) : Animal(species, age) {
    override fun makeSound () : String = "$species zwitschert oder singt"

}
class Parrot (
    species : String ,
    age : Int ,
    nocturnal : Boolean = false ,
    val knownWords : List <String>
) : Bird(species, age, nocturnal) {

    override fun makeSound () : String = "$species ahmt Wörter nach:${knownWords.joinToString("Hallo,Essen,Müde")}\""

}
class Owl(
    species : String ,
    age : Int ,
    nocturnal : Boolean = true ,
    val prey : List <String >
) : Bird(species, age, nocturnal) {
    override fun makeSound () : String = "Die $species hoot im Mondschein."

    fun flySilently () : String = "Die $age Jahre alt $species fliegt leise durch die Nacht."

    fun hunts () : String {
        val preyString = prey.joinToString(",")
        return "Die Eule fliegt lautlos und jagt $preyString."
    }
}

/* • Was ist die Oberklasse? Überlegen Sie, wo die Keywords abstract oder open Sinn machen.
    Die Oberklasse ist die Klasse Animal, da diese am allgemeinsten ist und keine konkrete Implementation für eine bestimmte Tierart vorgibt. Das Keyword "open" könnte sinnvoll sein, um die Klasse für spätere Vererbungen offen zu halten.

   • Was sind die Unterklassen?
    Die Unterklassen sind Pet, Cat, Dog, Bird, Parrot und Owl, da diese spezifischer sind und konkrete Implementationen für verschiedene Tierarten vorgeben.

   • Welche Eigenschaften und Methoden gehören in die Oberklassen, weil diese allgemein sind?


   • Welche Eigenschaften und Methoden gehören in die Unterklassen, weil diese spefizisch sind?
    Die Eigenschaften und Methoden, die in die Unterklassen gehören, sind solche, die spezifisch für die jeweilige Tierart sind, wie z.B. der Besitzer und der Name bei Pet, das Kratzen von Möbeln bei Cat und das Apportieren von Spielzeug bei Dog.

   • Welche Eigenschaften und Methoden müssten von welcher Unterklasse überschrieben / erweitert werden?
    In den Unterklassen Parrot und Owl müssten die Methoden makeSound und ggf. auch flySilently und hunts überschrieben bzw. erweitert werden, da diese spezifisch für diese Tierarten sind und sich von den anderen Unterklassen unterscheiden.
 */