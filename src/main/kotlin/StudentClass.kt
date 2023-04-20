class StudentClass(val id : String) {

   private val students = mutableListOf<Student>()
    fun addStudent(student: Student) {
        if (students.any { it.id == student.id }) { //  überprüfen, ob ein Schüler mit der gleichen ID wie der hinzuzufügende Schüler bereits in der Liste enthalten ist.
            throw IllegalArgumentException("Schüler ${student.name} ist bereits Teil der Klasse!")
        }
        students.add(student)
    }
}