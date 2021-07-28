package databaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many new users we want to add
        System.out.print("Enter how many students you want to add: ");
        Scanner scanner = new Scanner(System.in);
        int studentNumber = scanner.nextInt();
        Student[] students = new Student[studentNumber];

        // Create i number of new students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].enroll();
        }
    }
}
