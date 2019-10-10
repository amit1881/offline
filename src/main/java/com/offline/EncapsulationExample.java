package com.offline;

class StudentBean
{
    private int studentId;
    private String studentName;
    //private int studentMarks = 10;
    private int studentMarks;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getStudentMarks() {
        return studentMarks;
    }
    public void setStudentMarks(int studentMarks) {
        if(studentMarks > 500)
        this.studentMarks = studentMarks;
    }
}
public class EncapsulationExample 
{
    
    public static void main(String args[])
    {
        StudentBean sb = new StudentBean();
       
        //Setting values
        sb.setStudentId(99);
        sb.setStudentName("JIP");
        sb.setStudentMarks(45);
        
        //Retrieving the values
        System.out.println("Student Id : "+sb.getStudentId());
        System.out.println("Student Name : "+sb.getStudentName());
        System.out.println("Student Marks : "+sb.getStudentMarks());
        
        //Set the value for studentMarks greater than 500
        sb.setStudentMarks(600);
        System.out.println("New Student Mark : "+sb.getStudentMarks());
    }
}
