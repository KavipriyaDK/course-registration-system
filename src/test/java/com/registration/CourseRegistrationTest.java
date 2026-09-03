package com.registration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CourseRegistrationTest {
    @Test
    public void testStudentEligibility() {
        Student student = new Student("Test Student", "T01");
        student.registerSubject(new Subject("Course A", 10));
        student.registerSubject(new Subject("Course B", 5));
        assertTrue(student.isEligible(), "Should be eligible with 15 credits");
    }

    @Test
    public void testStudentIneligibility() {
        Student student = new Student("Test Student", "T02");
        student.registerSubject(new Subject("Course A", 8));
        assertFalse(student.isEligible(), "Should not be eligible with less than 15 credits");
    }
}
