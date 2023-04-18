import kotlin.time.measureTimedValue

class Course(val name : String){

    var grade : Double? = null
       set(value) {
           if (value == null){
               throw Exception ("Nullwert!")
           }
           if ( value < 1.0 ||  value > 6.0){
               throw Exception ("Keine gültige Note!")

           }
           field = value
       }
    val passed : Boolean
        get() {
            return grade?.let { it<=4.0} ?: false
        }
}
fun main(args: Array<String>) {
    val math = Course (" MATH ")
    math.grade = 5.0
    val english = Course (" ENGLISH ")
    english.grade = 3.0
    //val physics = Course (" PHYSICS ")
    //physics.grade = 0.7 // invalide
    //val chemistry = Course (" CHEMISTRY ")
    //chemistry.grade = 6.3 // invalide
    println ( math.passed ) // false
    println ( english.passed ) // true
}