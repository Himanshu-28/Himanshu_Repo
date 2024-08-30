package com.day04.assignment08;

public class DynamixEx {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide residential status (Hostelite or DayScholar) as command line argument.");
            return;
        }

        Student student = null;
        String residentialStatus = args[0].toLowerCase();

        if ("dayScholar".equalsIgnoreCase(residentialStatus)) {
            student = new DayScholar(101, 'B', "Himanshu Sharma", "Pune, MH");
        } else if ("hostelite".equalsIgnoreCase(residentialStatus)) {
            student = new Hostelite(101, 'B', "Himanshu Sharma");
        } else {
            System.out.println("Invalid residential status. Please provide either 'DayScholar' or 'Hostelite'.");
            return;
        }

        // Calculate fees and display details
        student.calculateFees(student.semesterFees);
        student.displayDetails();
    }
}
