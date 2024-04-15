package com.test.demo;

//Pojo class or Bean creation
//After creating this class, we'll ask Spring IOC to create object for this class

public class Student {
    private int StudentId;
    private String studentName;
    private String studentAddress;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    //Without this toString method, we will get a hashcode
    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    public Student(int studentId, String studentName, String studentAddress) {
        StudentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student() {
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
}
