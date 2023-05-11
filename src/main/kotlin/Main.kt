fun main () {
    //val dog = Dog (" Golden Retriever ", 6 , " Anja ", " Emma ", true )
    //val cat = Cat (" Britisch Kurzhaar ", 1, " Sascha ", " Lucy ")
    val bird = Bird (" Amsel ", 1, false )
    val owl = Owl (" Eule ", 5, true , listOf (" Maus ", " Maulwurf ") )
    val parrot = Parrot (" Blaupapagei ", 1, false , listOf (" Hallo ", " Guten Tag ", " Ich mag Pizza ", " Tschau") )
    println ( parrot.makeSound () ) // Blaupapagei ahmt Wörter nach : Hallo ,Guten Tag , Ich mag Pizza , Tschüß
    //println ( cat.scratchFurniture () ) // Lucy kratzt an den Möbeln und sagt Lucy sagt etwas : Miau !
    //println ( dog.fetchToy () ) // Emma bringt das Spielzeug zur ück und freut sich !
    println ( owl.flySilently () ) // Eule fliegt lautlos
    println ( owl.hunts () ) // Eule fliegt lautlos und jagt Maus , Maulwurf


    val dog = Dog (" Golden Retriever ", 6 , " Anja ", " Emma ", true )
    val cat = Cat (" Britisch Kurzhaar ", 1, " Sascha ", " Lucy ")

    dog. addAdoption ( UnlimitedAdoption (" Sandy "))
    cat. addAdoption ( LimitedAdoption (60) )
    cat. addAdoption ( UnlimitedAdoption (" Sandy "))
    parrot . addAdoption ( UnlimitedAdoption (" Mario "))

    val zoo = Zoo ()
    zoo.add( dog )
    zoo.add( cat )
    zoo.add( bird )
    zoo.add( owl )
    zoo.add( parrot )
    println( zoo.getTotalAdoptionMoney () ) // 3300
    println( zoo.getBirdsInZoo () ) // Bird , Owl , Parrot
    println( zoo.getUnlimitedAdopters () ) // Sandy . Mario
    println( zoo.getNumberOfGreetingParrots ( listOf (" Hallo ", " Guten Tag ")) ) // 1
    println( zoo.getBabies () ) // Cat , Bird , Parrot

}