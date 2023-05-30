package model;

import java.util.*;

/**
 * Programmes offered by a university
 */
public class Programme {
    /**
     * Name and id of the programme
     */
    private String name;
    private int pID;

    /**
     * Start date of the programme
     */
    private Date startDate;

    /**
     * End date of the programme
     */
    private Date dueDate;

    /**
     * Estimated duration of the course in months
     */
    private int estimatedDuration;

    /**
     * Students allocated to the programme
     */
    private Set<Student> enrolledStudents = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return pID + "";
    }

    public void setID(int ID) {
        this.pID = ID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean removeEnrolledStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    public boolean addStudent(Student student) {
        Date currentDate = new Date();
        if (currentDate.after(startDate)) {
            throw new IllegalStateException("Cannot enroll a student after the start date of the program.");
        }

        if (enrolledStudents.size() >= 250) {
            return false;
        }

        if (!student.getDepartment().isEmpty()) {
            throw new IllegalArgumentException("Student is already enrolled in the same program.");
        }

        enrolledStudents.add(student);
        student.setDepartment(name); // Update the department of the student to the program name
        return true;
    }
}
