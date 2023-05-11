class Zoo() {
    val animals = mutableListOf<Animal>()

    fun add(animal: Animal) = animals.add(animal)

    fun remove(animal: Animal) = animals.remove(animal)

    fun getTotalAdoptionMoney() : Double {
        var totalMoney = 0.0
        for (animal in animals) {
            for (adoption in animal.patenschaften) {
                totalMoney += adoption.price
            }
        }
        return totalMoney
    }
    fun getBirdsInZoo() : List<Bird> = animals.filterIsInstance<Bird>()

    fun getUnlimitedAdopters() : List<String>{
        val paten = mutableListOf<String>()
        for (animal in animals) {
            for(adoption in animal.patenschaften) {
                if (adoption is UnlimitedAdoption)
                    paten.add(adoption.name)
            }
        }
        return paten.distinct()
    }
    fun getNumberOfGreetingParrots(words: List<String>) : Int {
        var anzahl = 0
        for (animal in animals) {
            if (animal is Parrot && animal.knownWords.intersect(words).isNotEmpty()) {
                anzahl ++
            }
        }
        return anzahl

    }
    fun getBabies() : Int{
        var babies = 0
        for(animal in animals) {
            if (animal.age < 1) {
                babies ++
            }
        }
        return babies
    }
}