package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task9_UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        ArrayList<Integer> uniqueElement = new ArrayList<>();

        for (Integer each : list) {
            if (Collections.frequency(list,each ) == 1){
                uniqueElement.add(each);
            }

        }
        System.out.println(uniqueElement);

        /*
        nums.removeIf(p -> Collections.frequency(nums, p) > 1);
         */
    }
}
/*
Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]

 */