package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task11_SameFirstAndLast {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        ArrayList<String> list1 = new ArrayList<>();

        for (String each : list) {

            if (!(each.toLowerCase().charAt(0) == each.toLowerCase().charAt(each.length() - 1))) {
                list1.add(each);
           }
        }

        System.out.println("list1: " + list1);
    }
}
/*
Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Canada", "Lan", "Ebrahim", "Farida"]
 */