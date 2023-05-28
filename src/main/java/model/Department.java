package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Department in a university
 */
public class Department {
	/**
	 * name of the department
	 */
    private String name;
    /**
     * list of research courses associated with a department
     */
    private List<Course> courses = new ArrayList<Course>();
    /**
     * Students enrolled in a department
     */
    private List<Student> students = new ArrayList<Student>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setProjects(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


}
