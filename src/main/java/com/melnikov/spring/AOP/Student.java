package com.melnikov.spring.AOP;

public class Student {
    private String fullName;
    private int course;
    private double avgGrade;

    public Student(String fullName, int course, double avgGrade) {
        this.fullName = fullName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
