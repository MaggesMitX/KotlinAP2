import java.util.Currency
import kotlin.time.measureTimedValue


fun main(args: Array<String>) {
    val math = Course (CourseName.MATH)
    math.grade = 5.0
    val english = Course (CourseName.ENGLISH)
    english.grade = 3.0
    val chemistry = Course (CourseName.CHEMISTRY)
    //val physics = Course (" PHYSICS ")
    //physics.grade = 0.7 // invalide
    //val chemistry = Course (" CHEMISTRY ")
    //chemistry.grade = 6.3 // invalide
    println ( math.passed ) // false
    println ( english.passed ) // true

    val student1 = Student (" Erika Mustermann ", 21)
    val student2 = Student (" Max Mustermann ", 21)

    student1.addCourse ( math )
    student1.addCourse ( chemistry )
    student2.addCourse ( english )
    student1.addCourse ( math ) // invalide


}