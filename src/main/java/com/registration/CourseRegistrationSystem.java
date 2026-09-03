package com.registration;

public class CourseRegistrationSystem {
    public static void displayReport(Student student) {
        System.out.println("\n===== STUDENT REGISTRATION REPORT =====");
        System.out.println("Student Name : " + student.getName());
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Registered Subjects:");
        
        for (Subject s : student.getRegisteredSubjects()) {
            System.out.println("  - " + s.getSubjectName() + " (" + s.getCredits() + " credits)");
        }
        
        int totalCredits = student.calculateTotalCredits();
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("Status       : " + (student.isEligible() ? "ELIGIBLE" : "NOT ELIGIBLE (Credits < 15)"));
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        // Sample Student 1 (Eligible)
        Student s1 = new Student("Kavipriya", "STU001");
        s1.registerSubject(new Subject("Agile Development", 4));
        s1.registerSubject(new Subject("DevOps Practices", 4));
        s1.registerSubject(new Subject("Cloud Computing", 4));
        s1.registerSubject(new Subject("Software Testing", 3)); // Total 15

        // Sample Student 2 (Ineligible)
        Student s2 = new Student("Amit Kumar", "STU002");
        s2.registerSubject(new Subject("Mathematics", 4));
        s2.registerSubject(new Subject("Physics", 4)); // Total 8

        displayReport(s1);
        displayReport(s2);
    }
}
