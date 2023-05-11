class UnlimitedAdoption(val name: String) : Adoption {

    override val days: Int = Int.MAX_VALUE
    override val price: Double = 1000.0
    override val benefits: List<String> = listOf("Besuchen des Tieres", "Füttern des Tieres", "Streicheln des Tieres", "Gedenktafel am Gehege mit dem Namen $name")
}
