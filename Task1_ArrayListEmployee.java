package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro;

import Muhtar_SDET.Day17_ClassAndObject_Intro.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_ArrayListEmployee {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        // 1.1
        for (Employee each : employees) { // Employee is a class like Integer, String, Character class
            System.out.println(each.name + " : " + each.jobTitle); // each.name is instance of Employee classes
        }

        //1.2
        System.out.println("----------------------------------------------------------------------------------------");
        for (Employee each : employees) {
            if(each.jobTitle.equals("Java Developer")){ // if the job title of the employee is Java Developer
                System.out.println(each.name);  // prints the name of the employee
            }
        }
        //1.3
        System.out.println("----------------------------------------------------------------------------------------");
        double max = employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee each : employees) {
            if (each.salary > max){
                max = each.salary;
            }

            if (each.salary < min){
                min = each.salary;
            }
   }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        //1.4
        System.out.println("----------------------------------------------------------------------------------------");
        
        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.gender == 'M'){ // if the employee is male
                maleEmployees.add(employee);
            }else {
                femaleEmployees.add(employee);
            }
            
        }
        System.out.println("Total number of the female employee: " + femaleEmployees.size()) ; // finding female employee number
        System.out.println("Total number of the male employee: " + maleEmployees.size()) ; // finding male employee number

    }
}
/*
Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */