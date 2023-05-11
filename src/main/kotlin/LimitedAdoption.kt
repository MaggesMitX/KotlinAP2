class LimitedAdoption(override val days: Int) : Adoption{

    override val price: Double = days * 5.0
    override val benefits: List<String> = listOf("Besuchen des Tieres", "Füttern des Tieres")
}