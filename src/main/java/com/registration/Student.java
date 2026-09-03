package com.registration;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<Subject> registeredSubjects;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.registeredSubjects = new ArrayList<>();
    }

    public void registerSubject(Subject subject) {
        this.registeredSubjects.add(subject);
    }

    public int calculateTotalCredits() {
        int total = 0;
        for (Subject s : registeredSubjects) {
            total += s.getCredits();
        }
        return total;
    }

    public boolean isEligible() {
        return calculateTotalCredits() >= 15;
    }

    // Getters
    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public List<Subject> getRegisteredSubjects() { return registeredSubjects; }
}
