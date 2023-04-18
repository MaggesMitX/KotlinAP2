import kotlin.time.measureTimedValue

class Course(val name : String, var grade : Double? ){

      fun set(grade) {
            this.grade = if (this.grade < 1.0 || this.grade > 6.0) {
                throw Exception("Ungültige Eingabe!")
            } else {
                this.grade
            }
        }
}
fun main(args: Array<String>) {

}