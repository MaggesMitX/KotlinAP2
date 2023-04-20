class Course(val name : CourseName){

    var grade : Double? = null
        set(value) {                // Setter Methode
            if (value == null){
                throw Exception ("Nullwert!")
            }
            if ( value < 1.0 ||  value > 6.0){
                throw Exception ("Keine gültige Note!")

            }
            field = value
        }
    val passed : Boolean
        get() {         // Getter Methode 
            return grade?.let { it<=4.0} ?: false
        }
}