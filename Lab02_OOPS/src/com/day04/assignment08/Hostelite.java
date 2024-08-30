package com.day04.assignment08;

public class Hostelite extends Student {
    private double feesPerMonth;
    private final int hostelFees = 1200; // Additional hostel fees

    // Constructor
    public Hostelite(int studentID, char studentType, String studentName) {
        super(studentID, studentType, studentName);
    }

    // Implement abstract method
    @Override
    public void calculateFees(double semesterFee) {
        feesPerMonth = (semesterFee / 6.0) + hostelFees;
        System.out.println("Fees per month for Hostelite: " + feesPerMonth);
    }

    // Override displayDetails method to display Hostelite specific details
    @Override
    protected void displayDetails() {
        super.displayDetails(); // Display base class details
        System.out.println("Student Name: " + getStudentName());
    }
}
