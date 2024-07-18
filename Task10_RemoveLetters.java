package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task10_RemoveLetters  {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        boolean removedList = list.removeIf(p -> Character.isLetter(p) == true); // Character.isLetter(p) is just get character
                                                                                // nums.removeIf(p -> Collections.frequency(nums, p) > 1);  // Collections.frequency(nums, p) takes both list and element

        System.out.println(removedList);


    }
}

/*
Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']
 */