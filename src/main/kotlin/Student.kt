class Student (val name : String, var age : Int) {

    val courses = mutableListOf<Course>()
    fun addCourse(course: Course) {

        if (courses.contains(course)) {
            throw IllegalArgumentException("Kurs ist bereits Teil der Liste!")
        }
        courses.add(course)
    }
    fun averageGrade() : Double{
        if (courses.isEmpty()) {
            throw IllegalArgumentException("Es ist kein Kurs hinterlegt!")
        }
        var sum  = 0.0
        var size = 0
        for (course in courses){
            course.grade?.let {
                sum += it
                size++
            }
        }
        return sum / size
    }

}