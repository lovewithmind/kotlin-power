package com.company.kotlin.nullSafety

class NullShowcase {
    fun application() {

        val studentJava = StudentJava(null, 1, null)

        val student = Student(
                "studentName",
                12,
                null
        )
        val assignedSubject = student.assignedSubject?.size
    }
}