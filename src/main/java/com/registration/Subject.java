package com.registration;

public class Subject {
    private String subjectName;
    private int credits;

    public Subject(String subjectName, int credits) {
        this.subjectName = subjectName;
        this.credits = credits;
    }

    public String getSubjectName() { return subjectName; }
    public int getCredits() { return credits; }
}
