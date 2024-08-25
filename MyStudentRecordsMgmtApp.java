/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

/**
 *
 * @author asche
 */



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        // Creating an array of students
        Student[] students = new Student[] {
            new Student("110001", "Dave", LocalDate.of(1951, 11, 18)),
            new Student("110002", "Anna", LocalDate.of(1990, 12, 7)),
            new Student("110003", "Erica", LocalDate.of(1974, 1, 31)),
            new Student("110004", "Carlos", LocalDate.of(2009, 8, 22)),
            new Student("110005", "Bob", LocalDate.of(1990, 3, 5))
        };

        // Printing the list of students in ascending order of names
        printListOfStudents(students);

        // Printing the list of Platinum Alumni students in descending order of admission date
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        System.out.println("Platinum Alumni Students:");
        platinumAlumni.forEach(System.out::println);
    }

    // Method to print the list of students sorted by name
    public static void printListOfStudents(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getName));
        System.out.println("List of Students (sorted by name):");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to get the list of Platinum Alumni students
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumni = new ArrayList<>();
        LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
        for (Student student : students) {
            if (student.getDateOfAdmission().isBefore(thirtyYearsAgo)) {
                platinumAlumni.add(student);
            }
        }
        platinumAlumni.sort(Comparator.comparing(Student::getDateOfAdmission).reversed());
        return platinumAlumni;
    }
}

