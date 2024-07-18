package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task7_MaximumAndMinimumNumbers  {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Maximum number is: "+ Collections.max(list));
        System.out.println("Minimum number is: " + Collections.min(list));

        /* second option
         int min = nums.get(0);
        int max = nums.get(0);

        for(int each : nums){
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);


    }
         */ // second option


    }
}

/*
Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */