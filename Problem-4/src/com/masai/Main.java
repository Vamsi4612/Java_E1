package com.masai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number of Students you want to enter ");
        int n=s.nextInt();

        for (int i=0;i<n;i++){
            
            System.out.println("Enter the Roll Number");
            int roll=sc.nextInt();

            System.out.println("Enter the Name: ");
            String name=s.next();

            System.out.println("Enter the Marks: ");
            int marks= s.nextInt();

            Student student = new Student(roll,name,marks);

            System.out.println("\nStudent Details: "+i+1);
            System.out.println("Student Roll Number: "+student.getRollNumber());
            System.out.println("Student Name: "+student.getStudentName());
            System.out.println("Student Marks: "+(float)student.getMarks());
        }
       
    }
}