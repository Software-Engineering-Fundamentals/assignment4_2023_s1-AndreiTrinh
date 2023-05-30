package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AddStudent {

    private Programme programme;

    @BeforeEach
    public void initialize() {
        programme = new Programme();
        programme.setName("Computer Science");
        programme.setStartDate(new Date(System.currentTimeMillis() + 1000000)); // Set start date in the future
        programme.setDueDate(new Date(System.currentTimeMillis() + 2000000)); // Set due date in the future
        programme.setEstimatedDuration(12);
    }

    @Test
    @DisplayName("Add a new student to the program")
    public void addStudent_SuccessfulEnrollment() {
        Student student = new Student("John Doe", 123);
        assertTrue(programme.addStudent(student));
        assertEquals(1, programme.getEnrolledStudents().size());
        assertEquals("Computer Science", student.getDepartment());
    }

    @Test
    @DisplayName("Throw IllegalStateException when enrolling after the program start date")
    public void addStudent_ThrowsIllegalStateException_IfProgramStarted() {
        programme.setStartDate(new Date(System.currentTimeMillis() - 1000000)); // Set start date in the past

        Student student = new Student("Jane Smith", 456);
        assertThrows(IllegalStateException.class, () -> programme.addStudent(student));
        assertEquals(0, programme.getEnrolledStudents().size());
    }

    @Test
    @DisplayName("Do not allow more than 250 students to be enrolled")
    public void addStudent_ReturnsFalse_IfExceedsEnrollmentLimit() {
        for (int i = 0; i < 250; i++) {
            Student student = new Student("Student " + i, i);
            assertTrue(programme.addStudent(student));
        }

        Student extraStudent = new Student("Extra Student", 251);
        assertFalse(programme.addStudent(extraStudent));
        assertEquals(250, programme.getEnrolledStudents().size());
    }

    @Test
    @DisplayName("Throw IllegalArgumentException when trying to enroll a student already enrolled in the same program")
    public void addStudent_ThrowsIllegalArgumentException_IfStudentAlreadyEnrolled() {
        Student student = new Student("John Doe", 123);
        assertTrue(programme.addStudent(student));
        assertEquals(1, programme.getEnrolledStudents().size());

        assertThrows(IllegalArgumentException.class, () -> programme.addStudent(student));
        assertEquals(1, programme.getEnrolledStudents().size());
    }
}
