package com.day04.assignment06;

public class DynamixEx {

    public static void main(String[] args) {
        // Create an instance of DayScholar with the required parameters
        DayScholar dayScholar = new DayScholar(101, 'B', "Himanshu", 5000, "Pune, MH");

        // Setting additional details
        dayScholar.setStudentName("Himanshu Sharma");
        dayScholar.setResidentialAddress("Pune, MH");

        // Print details
        dayScholar.getDetails();
    }
}
