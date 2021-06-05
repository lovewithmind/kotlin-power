package com.company.kotlin.nullSafety;

import java.util.List;

public class StudentJava {
    private final String name;
    private final int rollNo;
    private final List<String> assignedSubject;

    public StudentJava(String name, int rollNo, List<String> assignedSubject) {
        this.name = name;
        this.rollNo = rollNo;
        this.assignedSubject = assignedSubject;
    }
}