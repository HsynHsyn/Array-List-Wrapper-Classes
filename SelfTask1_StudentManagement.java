package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

import java.util.ArrayList;

public class SelfTask1_StudentManagement {

    public ArrayList<String> studentNames = new ArrayList<>();
    public ArrayList<Integer> studentGrades = new ArrayList<>();

    /* extra try
    public void setInfo1(ArrayList<String> studentNames, ArrayList<Integer> studentGrades) {
        this.studentNames = studentNames;
        this.studentGrades = studentGrades;
    }*/


    // Method to add or update a student's information
    public void setInfo(String name, int grade) {

        int index = studentNames.indexOf(name);
        if (index != -1) {
            studentGrades.set(index, grade);
            System.out.println("Updated grade for " + name + " to " + grade);
        } else {
            studentNames.add(name);
            studentGrades.add(grade);
            System.out.println("Added student: " + name + " with grade " + grade);
        }
    }
    // Method to update a student's grade
    public void updateGrade(String name, int newGrade) {

        int index = studentNames.indexOf(name);
        if (index != -1) {
            studentGrades.set(index, newGrade);
            System.out.println(("Grade updated for " + name + " to " + newGrade));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to remove a student
    public void removeStudent(String name) {

        int index = studentNames.indexOf(name);

        if (index != -1) {
            studentNames.remove(index);
            studentGrades.remove(index);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");

        }

    }
    // Method to print all students and their grades
    public void printStudents() {

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Student: " + studentNames.get(i) + ", Grade: " + studentGrades.get(i));
        }
    }

    public double calculateAverageGrade() {

        if (studentGrades.isEmpty()) {
            System.out.println("No students available to calculate average grade.");
            return 0;
        }
        int total = 0;
        for (int grade : studentGrades) {
            total += grade;
        }
        double average = (double) total / studentGrades.size();
        System.out.println("Average grade: " + average);
        return average;
    }

    public String toString() {
        return "SelfTask1_StudentManagement{" +
                "studentNames=" + studentNames +
                ", studentGrades=" + studentGrades +
                '}';
    }



}