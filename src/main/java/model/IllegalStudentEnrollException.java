package model;

/**
 * Exception when a Student can not be added to a Programme
 */
public class IllegalStudentEnrollException extends Exception {
	 public IllegalStudentEnrollException(String errorMessage) {
	        super(errorMessage);}
}
