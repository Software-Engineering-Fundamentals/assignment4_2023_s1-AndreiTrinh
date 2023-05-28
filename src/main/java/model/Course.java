package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Multiple courses offered by a Programme
 */
public class Course {
    /**
     * Name the course
     */
    private String name;

    /**
     * Start date of the course
     */
    private Date startDate;

    /**
     * End date of the course
     */
    private Date dueDate;

    /**
     * Estimated duration of the course in months
     */
    private int estimatedDuration;

    /**
     * Students allocated to the course
     */
    private List<Student> enrolled = new ArrayList<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Student> getEnrollments() {
        return enrolled;
    }

    
    public boolean removeEnrolledStudent(Student student) {
    
    	return false;
    	   
    }


    /**
     * Verifies the course has valid dates.
     * @return true if dates are valid, false otherwise.
     */
    public boolean isValidDates(){
       return false;
    }




}
